/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AVetorVar extends PVar
{
    private TId _id_;
    private TLBkt _lBkt_;
    private TNumInteiro _numInteiro_;
    private TRBkt _rBkt_;

    public AVetorVar()
    {
        // Constructor
    }

    public AVetorVar(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLBkt _lBkt_,
        @SuppressWarnings("hiding") TNumInteiro _numInteiro_,
        @SuppressWarnings("hiding") TRBkt _rBkt_)
    {
        // Constructor
        setId(_id_);

        setLBkt(_lBkt_);

        setNumInteiro(_numInteiro_);

        setRBkt(_rBkt_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVar(
            cloneNode(this._id_),
            cloneNode(this._lBkt_),
            cloneNode(this._numInteiro_),
            cloneNode(this._rBkt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVar(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TLBkt getLBkt()
    {
        return this._lBkt_;
    }

    public void setLBkt(TLBkt node)
    {
        if(this._lBkt_ != null)
        {
            this._lBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBkt_ = node;
    }

    public TNumInteiro getNumInteiro()
    {
        return this._numInteiro_;
    }

    public void setNumInteiro(TNumInteiro node)
    {
        if(this._numInteiro_ != null)
        {
            this._numInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numInteiro_ = node;
    }

    public TRBkt getRBkt()
    {
        return this._rBkt_;
    }

    public void setRBkt(TRBkt node)
    {
        if(this._rBkt_ != null)
        {
            this._rBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBkt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._lBkt_)
            + toString(this._numInteiro_)
            + toString(this._rBkt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lBkt_ == child)
        {
            this._lBkt_ = null;
            return;
        }

        if(this._numInteiro_ == child)
        {
            this._numInteiro_ = null;
            return;
        }

        if(this._rBkt_ == child)
        {
            this._rBkt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lBkt_ == oldChild)
        {
            setLBkt((TLBkt) newChild);
            return;
        }

        if(this._numInteiro_ == oldChild)
        {
            setNumInteiro((TNumInteiro) newChild);
            return;
        }

        if(this._rBkt_ == oldChild)
        {
            setRBkt((TRBkt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}