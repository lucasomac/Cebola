/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import node.*;
import analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTAdicao(@SuppressWarnings("unused") TAdicao node)
    {
        this.index = 0;
    }

    @Override
    public void caseTSubtracao(@SuppressWarnings("unused") TSubtracao node)
    {
        this.index = 1;
    }

    @Override
    public void caseTMultiplicacao(@SuppressWarnings("unused") TMultiplicacao node)
    {
        this.index = 2;
    }

    @Override
    public void caseTDivisao(@SuppressWarnings("unused") TDivisao node)
    {
        this.index = 3;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 4;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 5;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 6;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 7;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 8;
    }

    @Override
    public void caseTPontovirgula(@SuppressWarnings("unused") TPontovirgula node)
    {
        this.index = 9;
    }

    @Override
    public void caseTDoispontos(@SuppressWarnings("unused") TDoispontos node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMaiorque(@SuppressWarnings("unused") TMaiorque node)
    {
        this.index = 11;
    }

    @Override
    public void caseTMenorque(@SuppressWarnings("unused") TMenorque node)
    {
        this.index = 12;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 13;
    }

    @Override
    public void caseTMaiorigual(@SuppressWarnings("unused") TMaiorigual node)
    {
        this.index = 14;
    }

    @Override
    public void caseTMenorigual(@SuppressWarnings("unused") TMenorigual node)
    {
        this.index = 15;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 16;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 17;
    }

    @Override
    public void caseTConst(@SuppressWarnings("unused") TConst node)
    {
        this.index = 18;
    }

    @Override
    public void caseTPrograma(@SuppressWarnings("unused") TPrograma node)
    {
        this.index = 19;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 20;
    }

    @Override
    public void caseTFimponto(@SuppressWarnings("unused") TFimponto node)
    {
        this.index = 21;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 22;
    }

    @Override
    public void caseTEscreva(@SuppressWarnings("unused") TEscreva node)
    {
        this.index = 23;
    }

    @Override
    public void caseTLeia(@SuppressWarnings("unused") TLeia node)
    {
        this.index = 24;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 25;
    }

    @Override
    public void caseTEntao(@SuppressWarnings("unused") TEntao node)
    {
        this.index = 26;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 27;
    }

    @Override
    public void caseTFimse(@SuppressWarnings("unused") TFimse node)
    {
        this.index = 28;
    }

    @Override
    public void caseTAspa(@SuppressWarnings("unused") TAspa node)
    {
        this.index = 29;
    }

    @Override
    public void caseTRepita(@SuppressWarnings("unused") TRepita node)
    {
        this.index = 30;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 31;
    }

    @Override
    public void caseTFimenquanto(@SuppressWarnings("unused") TFimenquanto node)
    {
        this.index = 32;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 33;
    }

    @Override
    public void caseTDe(@SuppressWarnings("unused") TDe node)
    {
        this.index = 34;
    }

    @Override
    public void caseTAte(@SuppressWarnings("unused") TAte node)
    {
        this.index = 35;
    }

    @Override
    public void caseTFaca(@SuppressWarnings("unused") TFaca node)
    {
        this.index = 36;
    }

    @Override
    public void caseTFimpara(@SuppressWarnings("unused") TFimpara node)
    {
        this.index = 37;
    }

    @Override
    public void caseTPasso(@SuppressWarnings("unused") TPasso node)
    {
        this.index = 38;
    }

    @Override
    public void caseTAvalie(@SuppressWarnings("unused") TAvalie node)
    {
        this.index = 39;
    }

    @Override
    public void caseTCaso(@SuppressWarnings("unused") TCaso node)
    {
        this.index = 40;
    }

    @Override
    public void caseTFimavalie(@SuppressWarnings("unused") TFimavalie node)
    {
        this.index = 41;
    }

    @Override
    public void caseTAbrecolchete(@SuppressWarnings("unused") TAbrecolchete node)
    {
        this.index = 42;
    }

    @Override
    public void caseTFecharcolchete(@SuppressWarnings("unused") TFecharcolchete node)
    {
        this.index = 43;
    }

    @Override
    public void caseTAbreparenteses(@SuppressWarnings("unused") TAbreparenteses node)
    {
        this.index = 44;
    }

    @Override
    public void caseTFechaparenteses(@SuppressWarnings("unused") TFechaparenteses node)
    {
        this.index = 45;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 46;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 47;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 48;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 49;
    }

    @Override
    public void caseTNumero(@SuppressWarnings("unused") TNumero node)
    {
        this.index = 50;
    }

    @Override
    public void caseTNumeroReal(@SuppressWarnings("unused") TNumeroReal node)
    {
        this.index = 51;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 52;
    }

    @Override
    public void caseTComentadofinal(@SuppressWarnings("unused") TComentadofinal node)
    {
        this.index = 53;
    }

    @Override
    public void caseTCorpo(@SuppressWarnings("unused") TCorpo node)
    {
        this.index = 54;
    }

    @Override
    public void caseTEstrela(@SuppressWarnings("unused") TEstrela node)
    {
        this.index = 55;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 56;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 57;
    }
}
