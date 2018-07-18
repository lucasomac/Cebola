/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AVetorVariaveld extends PVariaveld
{
    private TIdentificador _identificador_;
    private TNumero _numero_;

    public AVetorVariaveld()
    {
        // Constructor
    }

    public AVetorVariaveld(
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TNumero _numero_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setNumero(_numero_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVariaveld(
            cloneNode(this._identificador_),
            cloneNode(this._numero_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVariaveld(this);
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

    public TNumero getNumero()
    {
        return this._numero_;
    }

    public void setNumero(TNumero node)
    {
        if(this._numero_ != null)
        {
            this._numero_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numero_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._numero_);
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

        if(this._numero_ == child)
        {
            this._numero_ = null;
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

        if(this._numero_ == oldChild)
        {
            setNumero((TNumero) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
