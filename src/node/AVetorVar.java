/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AVetorVar extends PVar
{
    private TIdentificador _identificador_;
    private PExp _exp_;

    public AVetorVar()
    {
        // Constructor
    }

    public AVetorVar(
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVar(
            cloneNode(this._identificador_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVar(this);
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
