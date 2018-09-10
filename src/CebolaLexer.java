
import lexer.Lexer;
import lexer.Lexer.State;
import node.*;

/**
 *
 * @author LUCAS DE OLIVEIRA MACEDO
 */
public class CebolaLexer extends Lexer {

    private int count;
    public int desvio;
    public int line;
    private TComentado comment;
    private StringBuffer text;
    public boolean houveProblema = false;

    public CebolaLexer(java.io.PushbackReader in) {
        super(in);
    }
    // Filtro que reconhece comentários aninhados.

    @Override
    protected void filter() { // se estamos no estado de comentário
        if (this.token.getClass().getName().substring(6).equals("Cr")) {
            desvio++;
        }
        token.setLine(token.getLine() - desvio);
        if (state.equals(State.COMENTADO)) { // se estamos apenas entrando nesse estado
            if (comment == null) { // Suposto comentario
                //Mantemos uma referência a ele e definimos o contador para um
                comment = (TComentado) token;
                text = new StringBuffer(comment.getText());
                count = 1;
                token = null; // continue a scanner a entrada
            } else { //Ja era um comentario
                text.append(token.getText()); // acumule o texto
                if (token instanceof EOF) {
                    System.out.println("Erro: Tente nao comentar tudo!!!");
                    token = comment; // Retorne um comentario com o texto.
                    state = State.NORMAL; // va para o estado normal.
                    houveProblema = true;
                    comment = null;
                }
                if (token instanceof TComentado) {
                    count++;
                } else if (token instanceof TComentadofinal) {
                    count--;
                }
                if (count != 0) {
                    token = null; // continue a scanner a entrada
                } else {
                    token = comment; // retorne o comentario com o texto completo
                    state = State.NORMAL; 
                    comment = null;
                }
            }
        }
    }
}
