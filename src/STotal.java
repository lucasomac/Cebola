import node.*;
import analysis.*;

import java.util.LinkedList;
import java.util.HashMap;

public class STotal extends AnalysisAdapter {

    HashMap<String, Simbolo> tabelaSimbolos;

    public STotal() {
        tabelaSimbolos = new HashMap<String, Simbolo>();
    }

    private Simbolo getSimbolo(String valor) {
        //if(valor)
        System.out.println(valor);
        return new Simbolo();
    }

    @Override
    public void caseStart(Start no) {
        caseATotal((ATotal) no.getPTotal());
    }

    @Override
    public void caseATotal(ATotal node) {
        String nomePrograma = node.getIdentificador().getText();
        LinkedList<PDeclaracaoVariavel> listaDeclaracoes = node.getDeclaracaoVariavel();
        LinkedList<PComando> listaComandos = node.getComando();

        System.out.println("O nome do programa �: ".concat(nomePrograma));
        while (listaDeclaracoes.peek() != null) {
            Object no = listaDeclaracoes.pop();
            switch (no.getClass().toString()) {
                case "class node.ADconstanteDeclaracaoVariavel":
                    caseDeclaracaoVariavel((ADconstanteDeclaracaoVariavel) no);
                    break;
                case "class node.AVariavelDeclaracaoVariavel":
                    caseDeclaracaoVariavel((AVariavelDeclaracaoVariavel) no);
                    break;
            }
        }
    }

    public void caseDeclaracaoVariavel(ADconstanteDeclaracaoVariavel node) {
        System.out.println("Constate declarada!: " + node.getIdentificador().getText());
        String nome = node.getIdentificador().getText();
        if (tabelaSimbolos.containsKey(nome)) {
            System.out.println("Erro semantico " + "[" + Integer.toString(node.getIdentificador().getLine())
                    + "," + Integer.toString(node.getIdentificador().getPos()) + "]" + "constante j� declarada");
        } else {
            tabelaSimbolos.put(nome, getSimbolo(node.getValor().toString()));
        }
    }

    public void caseDeclaracaoVariavel(AVariavelDeclaracaoVariavel node) {
        System.out.println("Variavel declarada!: ");
    }

    @Override
    public void caseASimplesVariaveld(ASimplesVariaveld node) {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariaveld(AVetorVariaveld node) {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node) {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node) {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node) {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node) {
        defaultCase(node);
    }

    @Override
    public void caseANumeroValor(ANumeroValor node) {
        defaultCase(node);
    }

    @Override
    public void caseARealValor(ARealValor node) {
        defaultCase(node);
    }

    @Override
    public void caseAOperacaoExpr(AOperacaoExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseAOperacaologicaExpr(AOperacaologicaExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseANegativoExpr(ANegativoExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseANegadoExpr(ANegadoExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseAInternoExpr(AInternoExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseANumeroExpr(ANumeroExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseARealExpr(ARealExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExpr(AVariavelExpr node) {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node) {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node) {
        defaultCase(node);
    }

    @Override
    public void caseAAddOperacao(AAddOperacao node) {
        defaultCase(node);
    }

    @Override
    public void caseASubOperacao(ASubOperacao node) {
        defaultCase(node);
    }

    @Override
    public void caseAMultOperacao(AMultOperacao node) {
        defaultCase(node);
    }

    @Override
    public void caseADivOperacao(ADivOperacao node) {
        defaultCase(node);
    }

    @Override
    public void caseAMenorigOperacaologica(AMenorigOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorigOperacaologica(AMaiorigOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOperacaologica(AMenorOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOperacaologica(AMaiorOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOperacaologica(AIgualOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseADiffOperacaologica(ADiffOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAXorOperacaologica(AXorOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAOuOperacaologica(AOuOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseAEOperacaologica(AEOperacaologica node) {
        defaultCase(node);
    }

    @Override
    public void caseASeComandoSe(ASeComandoSe node) {
        defaultCase(node);
    }

    @Override
    public void caseASeNaoComandoSe(ASeNaoComandoSe node) {
        defaultCase(node);
    }

    @Override
    public void caseAComandoRepita(AComandoRepita node) {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquanto(AComandoEnquanto node) {
        defaultCase(node);
    }

    @Override
    public void caseACasos(ACasos node) {
        defaultCase(node);
    }

    @Override
    public void caseANormalComandoAvalie(ANormalComandoAvalie node) {
        defaultCase(node);
    }

    @Override
    public void caseASenaoComandoAvalie(ASenaoComandoAvalie node) {
        defaultCase(node);
    }

    @Override
    public void caseANumParatipos(ANumParatipos node) {
        defaultCase(node);
    }

    @Override
    public void caseAVarParatipos(AVarParatipos node) {
        defaultCase(node);
    }

    @Override
    public void caseASempassoComandoPara(ASempassoComandoPara node) {
        defaultCase(node);
    }

    @Override
    public void caseACompassoComandoPara(ACompassoComandoPara node) {
        defaultCase(node);
    }

    @Override
    public void caseANormalComandoEscrita(ANormalComandoEscrita node) {
        defaultCase(node);
    }

    @Override
    public void caseAStrComandoEscrita(AStrComandoEscrita node) {
        defaultCase(node);
    }

    @Override
    public void caseAComandoLeia(AComandoLeia node) {
        defaultCase(node);
    }

    @Override
    public void caseAComandoAtribuicao(AComandoAtribuicao node) {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node) {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node) {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node) {
        defaultCase(node);
    }

    @Override
    public void caseAAvaliarComando(AAvaliarComando node) {
        defaultCase(node);
    }

    @Override
    public void caseAEscritaComando(AEscritaComando node) {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node) {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node) {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node) {
        defaultCase(node);
    }

    @Override
    public void caseTAdicao(TAdicao node) {
        defaultCase(node);
    }

    @Override
    public void caseTSubtracao(TSubtracao node) {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node) {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node) {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node) {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node) {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node) {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node) {
        defaultCase(node);
    }

    @Override
    public void caseTPontovirgula(TPontovirgula node) {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node) {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorque(TMaiorque node) {
        defaultCase(node);
    }

    @Override
    public void caseTMenorque(TMenorque node) {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node) {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorigual(TMaiorigual node) {
        defaultCase(node);
    }

    @Override
    public void caseTMenorigual(TMenorigual node) {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node) {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node) {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node) {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node) {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node) {
        defaultCase(node);
    }

    @Override
    public void caseTFimponto(TFimponto node) {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node) {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node) {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node) {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node) {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node) {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node) {
        defaultCase(node);
    }

    @Override
    public void caseTFimse(TFimse node) {
        defaultCase(node);
    }

    @Override
    public void caseTAspa(TAspa node) {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node) {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node) {
        defaultCase(node);
    }

    @Override
    public void caseTFimenquanto(TFimenquanto node) {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node) {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node) {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node) {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node) {
        defaultCase(node);
    }

    @Override
    public void caseTFimpara(TFimpara node) {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node) {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node) {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node) {
        defaultCase(node);
    }

    @Override
    public void caseTFimavalie(TFimavalie node) {
        defaultCase(node);
    }

    @Override
    public void caseTAbrecolchete(TAbrecolchete node) {
        defaultCase(node);
    }

    @Override
    public void caseTFecharcolchete(TFecharcolchete node) {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node) {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node) {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node) {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node) {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node) {
        defaultCase(node);
    }

    @Override
    public void caseTAbreparenteses(TAbreparenteses node) {
        defaultCase(node);
    }

    @Override
    public void caseTFechaparenteses(TFechaparenteses node) {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node) {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node) {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node) {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioemlinha(TComentarioemlinha node) {
        defaultCase(node);
    }

    @Override
    public void caseTLf(TLf node) {
        defaultCase(node);
    }

    @Override
    public void caseTEspaco(TEspaco node) {
        defaultCase(node);
    }

    @Override
    public void caseTCr(TCr node) {
        defaultCase(node);
    }

    @Override
    public void caseTComentado(TComentado node) {
        defaultCase(node);
    }

    @Override
    public void caseTComentadofinal(TComentadofinal node) {
        defaultCase(node);
    }

    @Override
    public void caseTCorpo(TCorpo node) {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node) {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node) {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node) {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node) {
        defaultCase(node);
    }
}
