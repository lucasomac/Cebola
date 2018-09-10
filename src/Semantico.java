
import java.util.LinkedList;

import node.*;
import analysis.DepthFirstAdapter;

import java.util.HashMap;

/**
 *
 * @author Lucas de Oliveira Macedo
 */
public class Semantico extends DepthFirstAdapter {

    HashMap<String, Simbolo> tabelaSimbolos;

    public Semantico() {
        tabelaSimbolos = new HashMap<>();
    }

    private Simbolo getSimbolo(String valor) {
        Simbolo sim = new Simbolo();
        if (valor.charAt(0) == '\'') {
            sim.setTipo(Simbolo.CARACTERE);
            sim.setTamanho(valor.length() - 2);
            sim.setValor(valor.substring(1, valor.length() - 2));
        } else {
            if (valor.contains(",")) {
                sim.setTipo(Simbolo.REAL);
                valor = valor.replace(',', '.');
                sim.setValor(Double.parseDouble(valor));
            } else {
                sim.setTipo(Simbolo.INTEIRO);
                sim.setValor(Integer.parseInt(valor));
            }
        }
        return sim;
    }

    @Override
    public void outStart(Start node) {
        // TODO Auto-generated method stub
        super.outStart(node);
    }

    @Override
    public void outACebola(ACebola node) {
        // TODO Auto-generated method stub
        String nomePrograma = node.getIdentificador().getText();
        if (tabelaSimbolos.containsKey(nomePrograma)) {
            System.err.println("Erro semantico: O nome do programa nao pode ser usado como variavel [" + Integer.toString(node.getIdentificador().getLine())
                    + "," + Integer.toString(node.getIdentificador().getPos()) + "]");
        }
        super.outACebola(node);
    }

    @Override
    public void outADconstanteDeclVar(ADconstanteDeclVar node) {
        String nome = node.getIdentificador().getText();
        if (tabelaSimbolos.containsKey(nome)) {
            System.err.println("Erro semantico: constante já declarada [" + Integer.toString(node.getIdentificador().getLine())
                    + "," + Integer.toString(node.getIdentificador().getPos()) + "]");
        } else {
            tabelaSimbolos.put(nome, getSimbolo(node.getValor().toString()));
        }
        super.outADconstanteDeclVar(node);
    }

    @Override
    public void outAVariavelDeclVar(AVariavelDeclVar node) {
        String tipo = node.getTipo().toString();
        LinkedList<PVarld> lista = node.getPrimeiro();
        String nome = "";
        Node cara = node.getSegundo();
        while (true) {
            switch (cara.getClass().toString()) {
                case "class node.ASimplesVarld":
                    ASimplesVarld segundo = (ASimplesVarld) cara;
                    Token token = segundo.getIdentificador();
                    nome = token.getText();
                    if (tabelaSimbolos.containsKey(nome)) {
                        System.err.println("Erro semantico: variavel já declarada [" + Integer.toString(token.getLine())
                                + "," + Integer.toString(token.getPos()) + "]");
                    } else {
                        Simbolo simbolo = new Simbolo();
                        simbolo.setTipo(tipo);
                        tabelaSimbolos.put(nome, simbolo);
                    }
                    break;
                case "class node.AVetorVarld":
                    AVetorVarld segundo2 = (AVetorVarld) cara;
                    token = segundo2.getIdentificador();
                    nome = token.getText();

                    if (tabelaSimbolos.containsKey(nome)) {
                        System.err.println("Erro semantico: variavel já declarada [" + Integer.toString(token.getLine())
                                + "," + Integer.toString(token.getPos()) + "]");
                    } else {
                        Simbolo simbolo = new Simbolo();
                        simbolo.setTipo(tipo);
                        simbolo.setTamanho(Integer.parseInt(segundo2.getNumero().getText()));
                        tabelaSimbolos.put(nome, simbolo);
                    }
                    break;
            }
            if (lista.peek() != null) {
                cara = lista.pop();
            } else {
                break;
            }
        }
        super.outAVariavelDeclVar(node);
    }

    public int OperacaoExp(Node no) {
        // TODO Auto-generated method stub
        int ret = Simbolo.ERRO;
        switch (no.getClass().toString()) {
            case "class node.AOperacaoExp":
                int resul_esq;
                PExp esquerda = ((AOperacaoExp) no).getPrimeiro();
                int resul_dir;
                PExp direita = ((AOperacaoExp) no).getSegundo();
                resul_esq = OperacaoExp((Node) esquerda);
                resul_dir = OperacaoExp((Node) direita);

                // "inteiro" "real" "caractere" "ERRO"
                if (resul_esq == Simbolo.CARACTERE || resul_dir == Simbolo.CARACTERE) {
                    System.err.println("Erro semantico: operações aritméticas com caracteres não são permitidas,");
                    ret = Simbolo.ERRO;
                } else if (resul_esq == resul_dir) {
                    ret = resul_esq;
                } else if (resul_esq == Simbolo.REAL || resul_dir == Simbolo.REAL) {
                    ret = Simbolo.REAL;
                } else {
                    ret = Simbolo.INTEIRO;
                }
                break;

            case "class node.AInternoExp":
                ret = OperacaoExp(((AInternoExp) no).getExp());
                break;

            case "class node.ANegativoExp":
                ret = OperacaoExp(((ANegativoExp) no).getExp());
                if (ret == Simbolo.CARACTERE) {
                    ret = Simbolo.ERRO;
                    System.err.println("Erro semântico: operações aritméticas com caracteres não são permitidas!");
                }
                break;

            case "class node.ANumeroExp":
                ret = Simbolo.INTEIRO;
                break;

            case "class node.ARealExp":
                ret = Simbolo.REAL;
                break;

            case "class node.AVariavelExp":
                switch (((AVariavelExp) no).getVar().getClass().toString()) {
                    case "class node.AIdVar":
                        AIdVar variavel = (AIdVar) ((AVariavelExp) no).getVar();
                        Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                        if (sim != null) {
                            if (sim.getTamanho() != -15328 && sim.getTipo() != Simbolo.CARACTERE) {
                                System.err.println("Erro semantico: posição do vetor nao especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                                        + Integer.toString(variavel.getIdentificador().getLine())
                                        + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                            }
                            return sim.getTipo();
                        } else {
                            System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                        }
                        break;
                    case "class node.AVetorVar":
                        AVetorVar variavel2 = (AVetorVar) ((AVariavelExp) no).getVar();
                        sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                        if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                            System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel2.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                        }
                        if (sim != null) {
                            if (sim.getTipo() == Simbolo.CARACTERE) {
                                System.err.println("Erro semantico: Operação não autorizada para variáveis do tipo caractere, \'" + variavel2.getIdentificador().getText() + "\' ["
                                        + Integer.toString(variavel2.getIdentificador().getLine())
                                        + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                            } else if (sim.getTamanho() == -15328) {
                                System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                                        + Integer.toString(variavel2.getIdentificador().getLine())
                                        + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                            }
                            return sim.getTipo();
                        } else {
                            System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel2.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                        }

                        break;
                }
                break;
            default://case "class node.AOperacaologicaExp":
                ret = OperacaologicaExp(no);
                break;
        }
        return ret;
    }
//-------------------------------------------------

    public int OperacaologicaExp(Node no) {
        // TODO Auto-generated method stub
        int ret = Simbolo.ERRO;
        switch (no.getClass().toString()) {
            case "class node.AOperacaologicaExp":

                int resul_esq;
                PExp esquerda = ((AOperacaologicaExp) no).getPrimeiro();
                int resul_dir;
                PExp direita = ((AOperacaologicaExp) no).getSegundo();
                resul_esq = OperacaoExp((Node) esquerda);
                resul_dir = OperacaoExp((Node) direita);
                if (resul_esq == Simbolo.CARACTERE) {
                    switch (((AVariavelExp) ((Node) esquerda)).getVar().getClass().toString()) {
                        case "class node.AIdVar":
                            AIdVar variavel = (AIdVar) ((AVariavelExp) ((Node) esquerda)).getVar();
                            System.err.println("Erro semantico: operações lógicas com caracteres não são permitidas: \'" + variavel.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                            break;
                        case "class node.AVetorVar":
                            AVetorVar variavel2 = (AVetorVar) ((AVariavelExp) ((Node) esquerda)).getVar();
                            System.err.println("Erro semantico: operações lógicas com caracteres não são permitidas: \'" + variavel2.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel2.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                            break;

                    }
                    ret = Simbolo.ERRO;
                } else if (resul_dir == Simbolo.CARACTERE) {
                    switch (((AVariavelExp) ((Node) direita)).getVar().getClass().toString()) {
                        case "class node.AIdVar":
                            AIdVar variavel = (AIdVar) ((AVariavelExp) ((Node) direita)).getVar();
                            System.err.println("Erro semantico: operações lógicas com caracteres não são permitidas: \'" + variavel.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                            break;
                        case "class node.AVetorVar":
                            AVetorVar variavel2 = (AVetorVar) ((AVariavelExp) ((Node) direita)).getVar();
                            System.err.println("Erro semantico: operações lógicas com caracteres não são permitidas: \'" + variavel2.getIdentificador().getText() + "\' ["
                                    + Integer.toString(variavel2.getIdentificador().getLine())
                                    + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                            break;
                    }
                    ret = Simbolo.ERRO;
                } else if (resul_esq == Simbolo.ERRO || resul_dir == Simbolo.ERRO) {
                    ret = Simbolo.ERRO;
                } else {
                    ret = Simbolo.BOOLEANO;
                }
                break;

            case "class node.ANegadoExp":
                ret = OperacaologicaExp(((ANegadoExp) no).getExp());
                break;

            case "default":
                ret = OperacaoExp(no);
                break;
        }
        return ret;
    }

//-----------------------------------------------------------------------
    @Override
    public void outASeComandoSe(ASeComandoSe node) {
        int expr = OperacaologicaExp((Node) node.getExp());
        node.getComando();
        super.outASeComandoSe(node);
    }

    @Override
    public void outASeNaoComandoSe(ASeNaoComandoSe node) {
        // TODO Auto-generated method stub
        int expr = OperacaologicaExp((Node) node.getExp());
        super.outASeNaoComandoSe(node);
    }

    @Override
    public void outAComandoRepita(AComandoRepita node) {
        // TODO Auto-generated method stub
        OperacaoExp(node.getExp());
        super.outAComandoRepita(node);
    }

    @Override
    public void outAComandoEnquanto(AComandoEnquanto node) {
        // TODO Auto-generated method stub
        OperacaoExp(node.getExp());
        super.outAComandoEnquanto(node);
    }

    public void Casos(ACasos node, int esperado) {
        // TODO Auto-generated method stub
        switch (node.getValor().getClass().toString()) {
            case "class node.AStringValor":
                if (esperado != Simbolo.CARACTERE) {
                    System.err.println("Erro semantico: tipo diferente do esperado para o teste \'" + ((AStringValor) node.getValor()).getString().getText() + " ["
                            + Integer.toString(((AStringValor) node.getValor()).getString().getLine())
                            + "," + Integer.toString(((AStringValor) node.getValor()).getString().getPos()) + "]");
                }
                break;
            case "class node.ANumeroValor":
                if (esperado != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: tipo diferente do esperado para o teste \'" + ((ANumeroValor) node.getValor()).getNumero().getText() + "\' ["
                            + Integer.toString(((ANumeroValor) node.getValor()).getNumero().getLine())
                            + "," + Integer.toString(((ANumeroValor) node.getValor()).getNumero().getPos()) + "]");
                }
                break;
            case "class node.ARealValor":
                if (esperado != Simbolo.REAL) {
                    System.err.println("Erro semantico: tipo diferente do esperado para o teste \'" + ((ARealValor) node.getValor()).getNumeroReal().getText() + "\' ["
                            + Integer.toString(((ARealValor) node.getValor()).getNumeroReal().getLine())
                            + "," + Integer.toString(((ARealValor) node.getValor()).getNumeroReal().getPos()) + "]");
                }
                break;
        }
        super.outACasos(node);
    }

    /**
     *
     * @param node
     */
    @Override
    public void outANormalComandoAvalie(ANormalComandoAvalie node) {
        // TODO Auto-generated method stub
        int exp = OperacaoExp(node.getExp());
        LinkedList<PCasos> lista = node.getCasos();
        if (exp != Simbolo.ERRO) {
            while (lista.peek() != null) {
                Casos((ACasos) lista.pop(), exp);
            }
        }
        super.outANormalComandoAvalie(node);
    }

    @Override
    public void outASenaoComandoAvalie(ASenaoComandoAvalie node) {
        // TODO Auto-generated method stub
        int exp = OperacaoExp(node.getExp());
        LinkedList<PCasos> lista = node.getCasos();
        if (Simbolo.ERRO != exp) {
            while (lista.peek() != null) {
                Casos((ACasos) lista.pop(), exp);
            }
        }
        super.outASenaoComandoAvalie(node);
    }

    @Override
    public void outANumTipospara(ANumTipospara node) {
        // TODO Auto-generated method stub
        super.outANumTipospara(node);
    }

    @Override
    public void outAVarTipospara(AVarTipospara node) {
        // TODO Auto-generated method stub
        int tipoVar = -5;
        switch (node.getVar().getClass().toString()) {
            case "class node.AIdVar":
                AIdVar variavel = (AIdVar) node.getVar();
                Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() != -15328) {
                    System.err.println("Erro semantico: posicao do vetor nao especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: simbolos do comando PARA devem ser inteiros \'" + variavel.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel.getIdentificador().getLine())
                                + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                    }
                }

                break;
            case "class node.AVetorVar":
                AVetorVar variavel2 = (AVetorVar) node.getVar();
                sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                }
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() == -15328) {
                    System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: simbolos do comando PARA devem ser inteiros \'" + variavel2.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel2.getIdentificador().getLine())
                                + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                    }
                }

                break;
        }
        super.outAVarTipospara(node);
    }

    @Override
    public void outASempassoComandoPara(ASempassoComandoPara node) {
        // TODO Auto-generated method stub
        int tipoVar = -5;
        switch (node.getVar().getClass().toString()) {
            case "class node.AIdVar":
                AIdVar variavel = (AIdVar) node.getVar();
                Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() != -15328) {
                    System.err.println("Erro semantico: posicao do vetor não especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: iterador do PARA deve ser inteiro \'" + variavel.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel.getIdentificador().getLine())
                                + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                    }
                }

                break;
            case "class node.AVetorVar":
                AVetorVar variavel2 = (AVetorVar) node.getVar();
                sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                }
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() == -15328) {
                    System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: iterador do PARA deve ser inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel2.getIdentificador().getLine())
                                + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                    }
                }

                break;
        }
        super.outASempassoComandoPara(node);
    }

    @Override
    public void outACompassoComandoPara(ACompassoComandoPara node) {
        // TODO Auto-generated method stub
        int tipoVar = -5;
        switch (node.getVar().getClass().toString()) {
            case "class node.AIdVar":
                AIdVar variavel = (AIdVar) node.getVar();
                Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() != -15328) {
                    System.err.println("Erro semantico: posição do vetor nao especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: iterador do PARA deve ser inteiro \'" + variavel.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel.getIdentificador().getLine())
                                + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                    }
                }

                break;
            case "class node.AVetorVar":
                AVetorVar variavel2 = (AVetorVar) node.getVar();
                sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                }
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() == -15328) {
                    System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (Simbolo.INTEIRO != tipoVar) {
                        System.err.println("Erro semantico: iterador do PARA deve ser inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel2.getIdentificador().getLine())
                                + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                    }
                }

                break;
        }
        super.outACompassoComandoPara(node);
    }

    @Override
    public void outANormalComandoEscrita(ANormalComandoEscrita node) {
        // TODO Auto-generated method stub
        OperacaoExp(node.getExp());
        super.outANormalComandoEscrita(node);
    }

    @Override
    public void outAComandoLeia(AComandoLeia node) {
        // TODO Auto-generated method stub
        int tipoVar = -5;
        switch (node.getVar().getClass().toString()) {
            case "class node.AIdVar":
                AIdVar variavel = (AIdVar) node.getVar();
                Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() != -15328 && sim.getTipo() != Simbolo.CARACTERE) {
                    System.err.println("Erro semantico: posicao do vetor nao especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }

                break;
            case "class node.AVetorVar":
                AVetorVar variavel2 = (AVetorVar) node.getVar();
                sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                }
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() == -15328) {
                    System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }

                break;
        }
        //super.outAComandoLeia(node);
    }

    @Override
    public void outAComandoAtribuicao(AComandoAtribuicao node) {
        // TODO Auto-generated method stub
        int tipoVar = -5;
        int tipoExp = OperacaoExp(node.getExp());
        switch (node.getVar().getClass().toString()) {
            case "class node.AIdVar":
                AIdVar variavel = (AIdVar) node.getVar();
                Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() != -15328) {
                    System.err.println("Erro semantico: posicao do vetor nao especificada: \'" + variavel.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel.getIdentificador().getLine())
                            + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (tipoExp != tipoVar && tipoExp == Simbolo.REAL || tipoVar == Simbolo.CARACTERE) {
                        System.err.println("Erro incompatibilidade de tipos na atribuição a variavel \'" + variavel.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel.getIdentificador().getLine())
                                + "," + Integer.toString(variavel.getIdentificador().getPos()) + "]");
                    }
                }

                break;
            case "class node.AVetorVar":
                AVetorVar variavel2 = (AVetorVar) node.getVar();
                sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
                if (OperacaoExp((Node) variavel2.getExp()) != Simbolo.INTEIRO) {
                    System.err.println("Erro semantico: enderenço do vetor não é inteiro \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                }
                if (sim == null) {
                    System.err.println("Erro semantico: variável não declarada \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getTamanho() == -15328) {
                    System.err.println("Erro semantico: não é um vetor: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else if (sim.getValor() != null) {
                    System.err.println("Erro semantico: não se modifica o valor de uma constante: \'" + variavel2.getIdentificador().getText() + "\' ["
                            + Integer.toString(variavel2.getIdentificador().getLine())
                            + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                } else {
                    tipoVar = sim.getTipo();
                }
                if (tipoVar != -5) {
                    if (tipoExp != tipoVar && tipoExp == Simbolo.REAL || tipoVar == Simbolo.CARACTERE) {
                        System.err.println("Erro incompatibilidade de tipos na atribuição a variavel \'" + variavel2.getIdentificador().getText() + "\' ["
                                + Integer.toString(variavel2.getIdentificador().getLine())
                                + "," + Integer.toString(variavel2.getIdentificador().getPos()) + "]");
                    }
                }

                break;
        }
        //super.outAComandoAtribuicao(node);
    }

}
