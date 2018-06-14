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
    void caseAProgram(AProgram node);

    void caseTString(TString node);
    void caseTInicio(TInicio node);
    void caseTFimprograma(TFimprograma node);
    void caseTSe(TSe node);
    void caseTFimse(TFimse node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTFimenquanto(TFimenquanto node);
    void caseTPara(TPara node);
    void caseTAvalie(TAvalie node);
    void caseTFimavalie(TFimavalie node);
    void caseTCaso(TCaso node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTDe(TDe node);
    void caseTFaca(TFaca node);
    void caseTPasso(TPasso node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseTBooleano(TBooleano node);
    void caseTPrograma(TPrograma node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTVetor(TVetor node);
    void caseTConst(TConst node);
    void caseTTokenSpecifier(TTokenSpecifier node);
    void caseTProductionSpecifier(TProductionSpecifier node);
    void caseTAtrib(TAtrib node);
    void caseTSoma(TSoma node);
    void caseTSub(TSub node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTMaiorq(TMaiorq node);
    void caseTMenorq(TMenorq node);
    void caseTMaiorigualq(TMaiorigualq node);
    void caseTMenorigualq(TMenorigualq node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTAparentese(TAparentese node);
    void caseTFparentese(TFparentese node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTVirg(TVirg node);
    void caseTPontoevirg(TPontoevirg node);
    void caseTPonto(TPonto node);
    void caseTDoispontos(TDoispontos node);
    void caseTComentlinha(TComentlinha node);
    void caseTAbrebloco(TAbrebloco node);
    void caseTFechabloco(TFechabloco node);
    void caseTId(TId node);
    void caseTNum(TNum node);
    void caseTBlank(TBlank node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
