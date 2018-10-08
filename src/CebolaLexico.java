
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import lexer.*;
import node.*;

/**
 *
 * @author LUCAS DE OLIVEIRA MACEDO
 */
public class CebolaLexico {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                CebolaLexer lexer = new CebolaLexer(new PushbackReader(new FileReader("in1.txt"), 1024));
                //boolean erroSintatico = false;
                while (true) {
                    try {
                        Token tok = lexer.next();
                        if (!(tok instanceof EOF)) {
                            switch (tok.getClass().getSimpleName()) {
                                case "TLf":
                                    System.out.println(tok.getText());
                                    break;
                                case "TEspaco":
                                    System.out.print(" ");
                                    break;
                                default:
                                    System.out.print(tok.getClass().getSimpleName());
                                    break;
                            }
                        }
                        if ("".equals(tok.getText())) {
                            break;
                        }

                    } catch (IOException | LexerException e) {
                        lexer.houveProblema = true;
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                if (!lexer.houveProblema) {
                    System.out.println("\nCódigo pertence a linguagem!!");
                } else {
                    System.err.println("\n!!Executável não gerado. Erros de compilação encontrados!!");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.err.println("Nenhum arquivo foi dado como entrada");
            System.exit(1);
        }
    }
}
