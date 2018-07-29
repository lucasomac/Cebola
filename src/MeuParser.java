
import lexer.Lexer;
import parser.Parser;

public class MeuParser extends Parser {

    protected int last_pos = -1;
    protected int last_line = -1;

    public MeuParser(Lexer lexer) {

        super(lexer);
    }

    public int getLine() {
        return this.last_line;
    }

    public int getPos() {
        return this.last_pos;
    }

}
