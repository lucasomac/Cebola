/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMenorOperacaologica extends POperacaologica
{
    private TMenorq _menorq_;

    public AMenorOperacaologica()
    {
        // Constructor
    }

    public AMenorOperacaologica(
        @SuppressWarnings("hiding") TMenorq _menorq_)
    {
        // Constructor
        setMenorq(_menorq_);

    }

    @Override
    public Object clone()
    {
        return new AMenorOperacaologica(
            cloneNode(this._menorq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorOperacaologica(this);
    }

    public TMenorq getMenorq()
    {
        return this._menorq_;
    }

    public void setMenorq(TMenorq node)
    {
        if(this._menorq_ != null)
        {
            this._menorq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menorq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menorq_ == child)
        {
            this._menorq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menorq_ == oldChild)
        {
            setMenorq((TMenorq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
