/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TDoispt extends Token
{
    public TDoispt()
    {
        super.setText(":");
    }

    public TDoispt(int line, int pos)
    {
        super.setText(":");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoispt(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoispt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoispt text.");
    }
}
