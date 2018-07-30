/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANegativoExpr extends PExpr
{
    private TSubtracao _subtracao_;
    private PExpr _expr_;

    public ANegativoExpr()
    {
        // Constructor
    }

    public ANegativoExpr(
        @SuppressWarnings("hiding") TSubtracao _subtracao_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setSubtracao(_subtracao_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new ANegativoExpr(
            cloneNode(this._subtracao_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegativoExpr(this);
    }

    public TSubtracao getSubtracao()
    {
        return this._subtracao_;
    }

    public void setSubtracao(TSubtracao node)
    {
        if(this._subtracao_ != null)
        {
            this._subtracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subtracao_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._subtracao_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._subtracao_ == child)
        {
            this._subtracao_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._subtracao_ == oldChild)
        {
            setSubtracao((TSubtracao) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}