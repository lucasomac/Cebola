
import java.io.IOException;
import lexer.*;
import node.*;

public class Aninhado extends Lexer {

    private int pilha;
    private Token token;
    private Lexer lexer;

    public Aninhado(java.io.PushbackReader in, Lexer lexer, Token token) {
        super(in);
        this.lexer = lexer;
        this.token = token;
        this.pilha = 0;
    }

    protected void filter() throws LexerException, IOException {
        // PILHA DE TRATAMENTO DE COMENTARIOS EM BLOCO
        push();
        Token token_old = token;
        while (!pilhaVazia()) {
            token = lexer.next();
            if (token instanceof TAbrebloco) {
                token_old = token;
                push();
            } else if (token instanceof TFechabloco) {
                token_old = token;
                pop();
            } else if (token instanceof EOF) {
                System.out.print("Erro de comentario de bloco. Linha: " + token_old.getLine());
                System.out.print(", posicao: " + token_old.getPos() + ".");
                setPilha(-1);
                return;
            }
        }
        if (pilhaVazia()) {
            System.out.print("TComentBloco");
        }
    }

    private void push() {
        this.pilha++;
    }

    private void pop() {
        this.pilha--;
    }

    private void setPilha(int val) {
        this.pilha = val;
    }

    private boolean pilhaVazia() {
        if (pilha == 0) {
            return true;
        }

        return false;
    }

    public Lexer getLexer() {
        return this.lexer;
    }

    @Override
    public Token getToken() {
        return this.token;
    }
}
