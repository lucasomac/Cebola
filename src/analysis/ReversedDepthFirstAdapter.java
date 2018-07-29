/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPTotal().apply(this);
        outStart(node);
    }

    public void inATotal(ATotal node)
    {
        defaultIn(node);
    }

    public void outATotal(ATotal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATotal(ATotal node)
    {
        inATotal(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclaracaoVariavel> copy = new ArrayList<PDeclaracaoVariavel>(node.getDeclaracaoVariavel());
            Collections.reverse(copy);
            for(PDeclaracaoVariavel e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outATotal(node);
    }

    public void inAVariavelDeclaracaoVariavel(AVariavelDeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavelDeclaracaoVariavel(AVariavelDeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelDeclaracaoVariavel(AVariavelDeclaracaoVariavel node)
    {
        inAVariavelDeclaracaoVariavel(node);
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        {
            List<PVariaveld> copy = new ArrayList<PVariaveld>(node.getPrimeiro());
            Collections.reverse(copy);
            for(PVariaveld e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVariavelDeclaracaoVariavel(node);
    }

    public void inADconstanteDeclaracaoVariavel(ADconstanteDeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outADconstanteDeclaracaoVariavel(ADconstanteDeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADconstanteDeclaracaoVariavel(ADconstanteDeclaracaoVariavel node)
    {
        inADconstanteDeclaracaoVariavel(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outADconstanteDeclaracaoVariavel(node);
    }

    public void inASimplesVariaveld(ASimplesVariaveld node)
    {
        defaultIn(node);
    }

    public void outASimplesVariaveld(ASimplesVariaveld node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesVariaveld(ASimplesVariaveld node)
    {
        inASimplesVariaveld(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outASimplesVariaveld(node);
    }

    public void inAVetorVariaveld(AVetorVariaveld node)
    {
        defaultIn(node);
    }

    public void outAVetorVariaveld(AVetorVariaveld node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariaveld(AVetorVariaveld node)
    {
        inAVetorVariaveld(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVetorVariaveld(node);
    }

    public void inACaractereTipo(ACaractereTipo node)
    {
        defaultIn(node);
    }

    public void outACaractereTipo(ACaractereTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        inACaractereTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACaractereTipo(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANumeroValor(ANumeroValor node)
    {
        defaultIn(node);
    }

    public void outANumeroValor(ANumeroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroValor(ANumeroValor node)
    {
        inANumeroValor(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANumeroValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outARealValor(node);
    }

    public void inAOperacaoExpr(AOperacaoExpr node)
    {
        defaultIn(node);
    }

    public void outAOperacaoExpr(AOperacaoExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperacaoExpr(AOperacaoExpr node)
    {
        inAOperacaoExpr(node);
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        if(node.getOperacao() != null)
        {
            node.getOperacao().apply(this);
        }
        if(node.getPrimeiro() != null)
        {
            node.getPrimeiro().apply(this);
        }
        outAOperacaoExpr(node);
    }

    public void inAOperacaologicaExpr(AOperacaologicaExpr node)
    {
        defaultIn(node);
    }

    public void outAOperacaologicaExpr(AOperacaologicaExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperacaologicaExpr(AOperacaologicaExpr node)
    {
        inAOperacaologicaExpr(node);
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        if(node.getOperacaologica() != null)
        {
            node.getOperacaologica().apply(this);
        }
        if(node.getPrimeiro() != null)
        {
            node.getPrimeiro().apply(this);
        }
        outAOperacaologicaExpr(node);
    }

    public void inANegativoExpr(ANegativoExpr node)
    {
        defaultIn(node);
    }

    public void outANegativoExpr(ANegativoExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativoExpr(ANegativoExpr node)
    {
        inANegativoExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getSubtracao() != null)
        {
            node.getSubtracao().apply(this);
        }
        outANegativoExpr(node);
    }

    public void inANegadoExpr(ANegadoExpr node)
    {
        defaultIn(node);
    }

    public void outANegadoExpr(ANegadoExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegadoExpr(ANegadoExpr node)
    {
        inANegadoExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outANegadoExpr(node);
    }

    public void inAInternoExpr(AInternoExpr node)
    {
        defaultIn(node);
    }

    public void outAInternoExpr(AInternoExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInternoExpr(AInternoExpr node)
    {
        inAInternoExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAInternoExpr(node);
    }

    public void inANumeroExpr(ANumeroExpr node)
    {
        defaultIn(node);
    }

    public void outANumeroExpr(ANumeroExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroExpr(ANumeroExpr node)
    {
        inANumeroExpr(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANumeroExpr(node);
    }

    public void inARealExpr(ARealExpr node)
    {
        defaultIn(node);
    }

    public void outARealExpr(ARealExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealExpr(ARealExpr node)
    {
        inARealExpr(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outARealExpr(node);
    }

    public void inAVariavelExpr(AVariavelExpr node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpr(AVariavelExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpr(AVariavelExpr node)
    {
        inAVariavelExpr(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariavelExpr(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdVar(node);
    }

    public void inAVetorVar(AVetorVar node)
    {
        defaultIn(node);
    }

    public void outAVetorVar(AVetorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        inAVetorVar(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVetorVar(node);
    }

    public void inAAddOperacao(AAddOperacao node)
    {
        defaultIn(node);
    }

    public void outAAddOperacao(AAddOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddOperacao(AAddOperacao node)
    {
        inAAddOperacao(node);
        if(node.getAdicao() != null)
        {
            node.getAdicao().apply(this);
        }
        outAAddOperacao(node);
    }

    public void inASubOperacao(ASubOperacao node)
    {
        defaultIn(node);
    }

    public void outASubOperacao(ASubOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubOperacao(ASubOperacao node)
    {
        inASubOperacao(node);
        if(node.getSubtracao() != null)
        {
            node.getSubtracao().apply(this);
        }
        outASubOperacao(node);
    }

    public void inAMultOperacao(AMultOperacao node)
    {
        defaultIn(node);
    }

    public void outAMultOperacao(AMultOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultOperacao(AMultOperacao node)
    {
        inAMultOperacao(node);
        if(node.getMultiplicacao() != null)
        {
            node.getMultiplicacao().apply(this);
        }
        outAMultOperacao(node);
    }

    public void inADivOperacao(ADivOperacao node)
    {
        defaultIn(node);
    }

    public void outADivOperacao(ADivOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivOperacao(ADivOperacao node)
    {
        inADivOperacao(node);
        if(node.getDivisao() != null)
        {
            node.getDivisao().apply(this);
        }
        outADivOperacao(node);
    }

    public void inAMenorigOperacaologica(AMenorigOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAMenorigOperacaologica(AMenorigOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorigOperacaologica(AMenorigOperacaologica node)
    {
        inAMenorigOperacaologica(node);
        if(node.getMenorigual() != null)
        {
            node.getMenorigual().apply(this);
        }
        outAMenorigOperacaologica(node);
    }

    public void inAMaiorigOperacaologica(AMaiorigOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAMaiorigOperacaologica(AMaiorigOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorigOperacaologica(AMaiorigOperacaologica node)
    {
        inAMaiorigOperacaologica(node);
        if(node.getMaiorigual() != null)
        {
            node.getMaiorigual().apply(this);
        }
        outAMaiorigOperacaologica(node);
    }

    public void inAMenorOperacaologica(AMenorOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAMenorOperacaologica(AMenorOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorOperacaologica(AMenorOperacaologica node)
    {
        inAMenorOperacaologica(node);
        if(node.getMenorque() != null)
        {
            node.getMenorque().apply(this);
        }
        outAMenorOperacaologica(node);
    }

    public void inAMaiorOperacaologica(AMaiorOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAMaiorOperacaologica(AMaiorOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorOperacaologica(AMaiorOperacaologica node)
    {
        inAMaiorOperacaologica(node);
        if(node.getMaiorque() != null)
        {
            node.getMaiorque().apply(this);
        }
        outAMaiorOperacaologica(node);
    }

    public void inAIgualOperacaologica(AIgualOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAIgualOperacaologica(AIgualOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualOperacaologica(AIgualOperacaologica node)
    {
        inAIgualOperacaologica(node);
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        outAIgualOperacaologica(node);
    }

    public void inADiffOperacaologica(ADiffOperacaologica node)
    {
        defaultIn(node);
    }

    public void outADiffOperacaologica(ADiffOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiffOperacaologica(ADiffOperacaologica node)
    {
        inADiffOperacaologica(node);
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        outADiffOperacaologica(node);
    }

    public void inAXorOperacaologica(AXorOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAXorOperacaologica(AXorOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorOperacaologica(AXorOperacaologica node)
    {
        inAXorOperacaologica(node);
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        outAXorOperacaologica(node);
    }

    public void inAOuOperacaologica(AOuOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAOuOperacaologica(AOuOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuOperacaologica(AOuOperacaologica node)
    {
        inAOuOperacaologica(node);
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        outAOuOperacaologica(node);
    }

    public void inAEOperacaologica(AEOperacaologica node)
    {
        defaultIn(node);
    }

    public void outAEOperacaologica(AEOperacaologica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEOperacaologica(AEOperacaologica node)
    {
        inAEOperacaologica(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        outAEOperacaologica(node);
    }

    public void inASeComandoSe(ASeComandoSe node)
    {
        defaultIn(node);
    }

    public void outASeComandoSe(ASeComandoSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComandoSe(ASeComandoSe node)
    {
        inASeComandoSe(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outASeComandoSe(node);
    }

    public void inASeNaoComandoSe(ASeNaoComandoSe node)
    {
        defaultIn(node);
    }

    public void outASeNaoComandoSe(ASeNaoComandoSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeNaoComandoSe(ASeNaoComandoSe node)
    {
        inASeNaoComandoSe(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getSegundo());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outASeNaoComandoSe(node);
    }

    public void inAComandoRepita(AComandoRepita node)
    {
        defaultIn(node);
    }

    public void outAComandoRepita(AComandoRepita node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoRepita(AComandoRepita node)
    {
        inAComandoRepita(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAComandoRepita(node);
    }

    public void inAComandoEnquanto(AComandoEnquanto node)
    {
        defaultIn(node);
    }

    public void outAComandoEnquanto(AComandoEnquanto node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoEnquanto(AComandoEnquanto node)
    {
        inAComandoEnquanto(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAComandoEnquanto(node);
    }

    public void inACasos(ACasos node)
    {
        defaultIn(node);
    }

    public void outACasos(ACasos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasos(ACasos node)
    {
        inACasos(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outACasos(node);
    }

    public void inANormalComandoAvalie(ANormalComandoAvalie node)
    {
        defaultIn(node);
    }

    public void outANormalComandoAvalie(ANormalComandoAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormalComandoAvalie(ANormalComandoAvalie node)
    {
        inANormalComandoAvalie(node);
        {
            List<PCasos> copy = new ArrayList<PCasos>(node.getCasos());
            Collections.reverse(copy);
            for(PCasos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outANormalComandoAvalie(node);
    }

    public void inASenaoComandoAvalie(ASenaoComandoAvalie node)
    {
        defaultIn(node);
    }

    public void outASenaoComandoAvalie(ASenaoComandoAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoComandoAvalie(ASenaoComandoAvalie node)
    {
        inASenaoComandoAvalie(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PCasos> copy = new ArrayList<PCasos>(node.getCasos());
            Collections.reverse(copy);
            for(PCasos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outASenaoComandoAvalie(node);
    }

    public void inANumParatipos(ANumParatipos node)
    {
        defaultIn(node);
    }

    public void outANumParatipos(ANumParatipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumParatipos(ANumParatipos node)
    {
        inANumParatipos(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANumParatipos(node);
    }

    public void inAVarParatipos(AVarParatipos node)
    {
        defaultIn(node);
    }

    public void outAVarParatipos(AVarParatipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarParatipos(AVarParatipos node)
    {
        inAVarParatipos(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarParatipos(node);
    }

    public void inASempassoComandoPara(ASempassoComandoPara node)
    {
        defaultIn(node);
    }

    public void outASempassoComandoPara(ASempassoComandoPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASempassoComandoPara(ASempassoComandoPara node)
    {
        inASempassoComandoPara(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        if(node.getParatipos() != null)
        {
            node.getParatipos().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outASempassoComandoPara(node);
    }

    public void inACompassoComandoPara(ACompassoComandoPara node)
    {
        defaultIn(node);
    }

    public void outACompassoComandoPara(ACompassoComandoPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompassoComandoPara(ACompassoComandoPara node)
    {
        inACompassoComandoPara(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTerceiro() != null)
        {
            node.getTerceiro().apply(this);
        }
        if(node.getSegundo() != null)
        {
            node.getSegundo().apply(this);
        }
        if(node.getParatipos() != null)
        {
            node.getParatipos().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outACompassoComandoPara(node);
    }

    public void inANormalComandoEscrita(ANormalComandoEscrita node)
    {
        defaultIn(node);
    }

    public void outANormalComandoEscrita(ANormalComandoEscrita node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormalComandoEscrita(ANormalComandoEscrita node)
    {
        inANormalComandoEscrita(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outANormalComandoEscrita(node);
    }

    public void inAStrComandoEscrita(AStrComandoEscrita node)
    {
        defaultIn(node);
    }

    public void outAStrComandoEscrita(AStrComandoEscrita node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrComandoEscrita(AStrComandoEscrita node)
    {
        inAStrComandoEscrita(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrComandoEscrita(node);
    }

    public void inAComandoLeia(AComandoLeia node)
    {
        defaultIn(node);
    }

    public void outAComandoLeia(AComandoLeia node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoLeia(AComandoLeia node)
    {
        inAComandoLeia(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAComandoLeia(node);
    }

    public void inAComandoAtribuicao(AComandoAtribuicao node)
    {
        defaultIn(node);
    }

    public void outAComandoAtribuicao(AComandoAtribuicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoAtribuicao(AComandoAtribuicao node)
    {
        inAComandoAtribuicao(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAComandoAtribuicao(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        if(node.getComandoLeia() != null)
        {
            node.getComandoLeia().apply(this);
        }
        outALeiaComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        if(node.getComandoRepita() != null)
        {
            node.getComandoRepita().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getComandoEnquanto() != null)
        {
            node.getComandoEnquanto().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inAAvaliarComando(AAvaliarComando node)
    {
        defaultIn(node);
    }

    public void outAAvaliarComando(AAvaliarComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvaliarComando(AAvaliarComando node)
    {
        inAAvaliarComando(node);
        if(node.getComandoAvalie() != null)
        {
            node.getComandoAvalie().apply(this);
        }
        outAAvaliarComando(node);
    }

    public void inAEscritaComando(AEscritaComando node)
    {
        defaultIn(node);
    }

    public void outAEscritaComando(AEscritaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscritaComando(AEscritaComando node)
    {
        inAEscritaComando(node);
        if(node.getComandoEscrita() != null)
        {
            node.getComandoEscrita().apply(this);
        }
        outAEscritaComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getComandoSe() != null)
        {
            node.getComandoSe().apply(this);
        }
        outASeComando(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getComandoAtribuicao() != null)
        {
            node.getComandoAtribuicao().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getComandoPara() != null)
        {
            node.getComandoPara().apply(this);
        }
        outAParaComando(node);
    }
}
