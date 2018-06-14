import lexer.*;
import node.*;
import java.io.*;
import parser.Parser;
import parser.ParserException;

public class Cebola {

    public static void main(String[] args) throws LexerException, IOException, ParserException {
        Lexer lexer = new Lexer(new PushbackReader(new FileReader(args[0]), 1024));
        Cebola main = new Cebola();
        Token token = null;
        main.AnaliseLexica(new PushbackReader(new FileReader(args[0]), 1024), lexer, token);
        Parser parser = new Parser(lexer);
        Start tree = parser.parse();
        tree.toString();
        System.out.println();
        System.out.println("Análise sintática bem sucedida !");
    }

    public void AnaliseLexica(PushbackReader in, Lexer lexer, Token token) throws IOException, LexerException {

//        boolean flag = false;
//        do {
        try {
            while (!((token = lexer.next()) instanceof EOF)) {
                if (token instanceof TAbrebloco) {
                    Aninhado ninho = new Aninhado(in, lexer, token);
                    ninho.filter();
//                    token = ninho.getToken();
//                    lexer = ninho.getLexer();
//                    ninho = null;
                } else if (token instanceof TFechabloco) {
                    System.out.print("Erro de comentario de bloco. Linha: " + token.getLine());
                    System.out.print(", posicao: " + token.getPos() + ". : TComentarioBlocoFimErrado");
                } else if (!(token instanceof TBlank)) {
                    System.out.print(token.getClass().getSimpleName());
                } else {
                    System.out.print(token.getText());
                }
            }
//            flag = true;
        } catch (LexerException e) {
            System.out.print(e.getMessage().substring(0, e.getMessage().length() - 1) + " ");
        }
//        } while (!(flag));
    }
}
