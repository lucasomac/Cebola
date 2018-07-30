/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACebola(ACebola node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelDeclaracaoVariavel(AVariavelDeclaracaoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADconstanteDeclaracaoVariavel(ADconstanteDeclaracaoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesVariaveld(ASimplesVariaveld node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariaveld(AVetorVariaveld node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroValor(ANumeroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperacaoExpr(AOperacaoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperacaologicaExpr(AOperacaologicaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativoExpr(ANegativoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegadoExpr(ANegadoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInternoExpr(AInternoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroExpr(ANumeroExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealExpr(ARealExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExpr(AVariavelExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddOperacao(AAddOperacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubOperacao(ASubOperacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultOperacao(AMultOperacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivOperacao(ADivOperacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorigOperacaologica(AMenorigOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorigOperacaologica(AMaiorigOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOperacaologica(AMenorOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOperacaologica(AMaiorOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOperacaologica(AIgualOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiffOperacaologica(ADiffOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorOperacaologica(AXorOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuOperacaologica(AOuOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEOperacaologica(AEOperacaologica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComandoSe(ASeComandoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeNaoComandoSe(ASeNaoComandoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoRepita(AComandoRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquanto(AComandoEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasos(ACasos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANormalComandoAvalie(ANormalComandoAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoComandoAvalie(ASenaoComandoAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumParatipos(ANumParatipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarParatipos(AVarParatipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASempassoComandoPara(ASempassoComandoPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompassoComandoPara(ACompassoComandoPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANormalComandoEscrita(ANormalComandoEscrita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrComandoEscrita(AStrComandoEscrita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoLeia(AComandoLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoAtribuicao(AComandoAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvaliarComando(AAvaliarComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscritaComando(AEscritaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAdicao(TAdicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubtracao(TSubtracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontovirgula(TPontovirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreparenteses(TAbreparenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaparenteses(TFechaparenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbrecolchete(TAbrecolchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFecharcolchete(TFecharcolchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspa(TAspa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorque(TMaiorque node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorque(TMenorque node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorigual(TMaiorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorigual(TMenorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimponto(TFimponto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimse(TFimse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimenquanto(TFimenquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimpara(TFimpara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimavalie(TFimavalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioemlinha(TComentarioemlinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLf(TLf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEspaco(TEspaco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCr(TCr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentado(TComentado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentadofinal(TComentadofinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCorpo(TCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
