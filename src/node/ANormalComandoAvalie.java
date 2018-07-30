/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ANormalComandoAvalie extends PComandoAvalie
{
    private PExpr _expr_;
    private final LinkedList<PCasos> _casos_ = new LinkedList<PCasos>();

    public ANormalComandoAvalie()
    {
        // Constructor
    }

    public ANormalComandoAvalie(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") List<?> _casos_)
    {
        // Constructor
        setExpr(_expr_);

        setCasos(_casos_);

    }

    @Override
    public Object clone()
    {
        return new ANormalComandoAvalie(
            cloneNode(this._expr_),
            cloneList(this._casos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANormalComandoAvalie(this);
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

    public LinkedList<PCasos> getCasos()
    {
        return this._casos_;
    }

    public void setCasos(List<?> list)
    {
        for(PCasos e : this._casos_)
        {
            e.parent(null);
        }
        this._casos_.clear();

        for(Object obj_e : list)
        {
            PCasos e = (PCasos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._casos_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._casos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._casos_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        for(ListIterator<PCasos> i = this._casos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCasos) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}