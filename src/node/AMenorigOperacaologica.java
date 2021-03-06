/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMenorigOperacaologica extends POperacaologica
{
    private TMenorigual _menorigual_;

    public AMenorigOperacaologica()
    {
        // Constructor
    }

    public AMenorigOperacaologica(
        @SuppressWarnings("hiding") TMenorigual _menorigual_)
    {
        // Constructor
        setMenorigual(_menorigual_);

    }

    @Override
    public Object clone()
    {
        return new AMenorigOperacaologica(
            cloneNode(this._menorigual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorigOperacaologica(this);
    }

    public TMenorigual getMenorigual()
    {
        return this._menorigual_;
    }

    public void setMenorigual(TMenorigual node)
    {
        if(this._menorigual_ != null)
        {
            this._menorigual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorigual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menorigual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menorigual_ == child)
        {
            this._menorigual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menorigual_ == oldChild)
        {
            setMenorigual((TMenorigual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
