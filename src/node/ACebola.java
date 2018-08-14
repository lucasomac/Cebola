/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ACebola extends PCebola
{
    private TIdentificador _identificador_;
    private final LinkedList<PDeclVar> _declVar_ = new LinkedList<PDeclVar>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public ACebola()
    {
        // Constructor
    }

    public ACebola(
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") List<?> _declVar_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setDeclVar(_declVar_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ACebola(
            cloneNode(this._identificador_),
            cloneList(this._declVar_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACebola(this);
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

    public LinkedList<PDeclVar> getDeclVar()
    {
        return this._declVar_;
    }

    public void setDeclVar(List<?> list)
    {
        for(PDeclVar e : this._declVar_)
        {
            e.parent(null);
        }
        this._declVar_.clear();

        for(Object obj_e : list)
        {
            PDeclVar e = (PDeclVar) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declVar_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._declVar_)
            + toString(this._comando_);
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

        if(this._declVar_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
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

        for(ListIterator<PDeclVar> i = this._declVar_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclVar) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
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
