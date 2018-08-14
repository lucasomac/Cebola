/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseACebola(ACebola node);
    void caseAVariavelDeclVar(AVariavelDeclVar node);
    void caseADconstanteDeclVar(ADconstanteDeclVar node);
    void caseASimplesVarld(ASimplesVarld node);
    void caseAVetorVarld(AVetorVarld node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseARealTipo(ARealTipo node);
    void caseAStringValor(AStringValor node);
    void caseANumeroValor(ANumeroValor node);
    void caseARealValor(ARealValor node);
    void caseAOperacaoExp(AOperacaoExp node);
    void caseAOperacaologicaExp(AOperacaologicaExp node);
    void caseANegativoExp(ANegativoExp node);
    void caseANegadoExp(ANegadoExp node);
    void caseAInternoExp(AInternoExp node);
    void caseANumeroExp(ANumeroExp node);
    void caseARealExp(ARealExp node);
    void caseAVariavelExp(AVariavelExp node);
    void caseAIdVar(AIdVar node);
    void caseAVetorVar(AVetorVar node);
    void caseAAddOperacao(AAddOperacao node);
    void caseASubOperacao(ASubOperacao node);
    void caseAMultOperacao(AMultOperacao node);
    void caseADivOperacao(ADivOperacao node);
    void caseAMenorigOperacaologica(AMenorigOperacaologica node);
    void caseAMaiorigOperacaologica(AMaiorigOperacaologica node);
    void caseAMenorOperacaologica(AMenorOperacaologica node);
    void caseAMaiorOperacaologica(AMaiorOperacaologica node);
    void caseAIgualOperacaologica(AIgualOperacaologica node);
    void caseADiffOperacaologica(ADiffOperacaologica node);
    void caseAXorOperacaologica(AXorOperacaologica node);
    void caseAOuOperacaologica(AOuOperacaologica node);
    void caseAEOperacaologica(AEOperacaologica node);
    void caseASeComandoSe(ASeComandoSe node);
    void caseASeNaoComandoSe(ASeNaoComandoSe node);
    void caseAComandoRepita(AComandoRepita node);
    void caseAComandoEnquanto(AComandoEnquanto node);
    void caseACasos(ACasos node);
    void caseANormalComandoAvalie(ANormalComandoAvalie node);
    void caseASenaoComandoAvalie(ASenaoComandoAvalie node);
    void caseANumTipospara(ANumTipospara node);
    void caseAVarTipospara(AVarTipospara node);
    void caseASempassoComandoPara(ASempassoComandoPara node);
    void caseACompassoComandoPara(ACompassoComandoPara node);
    void caseANormalComandoEscrita(ANormalComandoEscrita node);
    void caseAStrComandoEscrita(AStrComandoEscrita node);
    void caseAComandoLeia(AComandoLeia node);
    void caseAComandoAtribuicao(AComandoAtribuicao node);
    void caseALeiaComando(ALeiaComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAAvaliarComando(AAvaliarComando node);
    void caseAEscritaComando(AEscritaComando node);
    void caseASeComando(ASeComando node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseAParaComando(AParaComando node);

    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTVezes(TVezes node);
    void caseTDivisao(TDivisao node);
    void caseTCaractere(TCaractere node);
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTString(TString node);
    void caseTPtvirg(TPtvirg node);
    void caseTDoispt(TDoispt node);
    void caseTVirg(TVirg node);
    void caseTApar(TApar node);
    void caseTFpar(TFpar node);
    void caseTAcol(TAcol node);
    void caseTFcol(TFcol node);
    void caseTAspa(TAspa node);
    void caseTMaiorq(TMaiorq node);
    void caseTMenorq(TMenorq node);
    void caseTIgual(TIgual node);
    void caseTMaiorigual(TMaiorigual node);
    void caseTMenorigual(TMenorigual node);
    void caseTDiferente(TDiferente node);
    void caseTConst(TConst node);
    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTPonto(TPonto node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimse(TFimse node);
    void caseTRepita(TRepita node);
    void caseTEnquanto(TEnquanto node);
    void caseTFimenquanto(TFimenquanto node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTAte(TAte node);
    void caseTFaca(TFaca node);
    void caseTFimpara(TFimpara node);
    void caseTPasso(TPasso node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTFimavalie(TFimavalie node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTNao(TNao node);
    void caseTNumero(TNumero node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTComenlinha(TComenlinha node);
    void caseTLf(TLf node);
    void caseTEspaco(TEspaco node);
    void caseTCr(TCr node);
    void caseTComentado(TComentado node);
    void caseTComentadofinal(TComentadofinal node);
    void caseTCorpo(TCorpo node);
    void caseTEstrela(TEstrela node);
    void caseTBarra(TBarra node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIdentificador(TIdentificador node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
