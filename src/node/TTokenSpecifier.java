/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TTokenSpecifier extends Token
{
    public TTokenSpecifier()
    {
        super.setText("T");
    }

    public TTokenSpecifier(int line, int pos)
    {
        super.setText("T");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenSpecifier(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenSpecifier(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenSpecifier text.");
    }
}
