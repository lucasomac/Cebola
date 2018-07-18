import lexer.Lexer;
import lexer.Lexer.State;
import node.*;

public class Aninhado extends Lexer {
	private int count;
	public int desvio;
	public int line;
	private TComentado comment;
	private StringBuffer text;
	public boolean houveProblema = false;
	
	// We define a constructor
	public Aninhado(java.io.PushbackReader in) {
		super(in);
	}
	// We define a filter that recognizes nested comments.
	protected void filter() { // if we are in the comment state
		if(this.token.getClass().getName().substring(6).equals("Cr"))
		{desvio++;
		}
		token.setLine(token.getLine() -desvio);
		if (state.equals(State.COMENTADO)) { // if we are just entering this state
			if (comment == null) { // The token is supposed to be a comment.
									// We keep a reference to it and set the
									// count to one
				comment = (TComentado) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null; // continue to scan the input.
			} else { // we were already in the comment state
				text.append(token.getText()); // accumulate the text.
				if (token instanceof EOF)
					{System.out.println("Erro: Tente nao comentar tudo!!!");
					 token = comment; // return a comment with the full text.
				     state = State.NORMAL; // go back to normal.
				     houveProblema = true;
				     comment = null;
					}
				if (token instanceof TComentado)
					count++;
				else if (token instanceof TComentadofinal)
					count--;
				if (count != 0)
					token = null; // continue to scan the input.
				else {
					//comment.setText(text.toString());
					token = comment; // return a comment with the full text.
					state = State.NORMAL; // go back to normal.
					comment = null; // We release this reference.
				}
			}
		}
	}
}