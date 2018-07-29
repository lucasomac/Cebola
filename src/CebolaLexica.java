
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import lexer.LexerException;
import node.Token;

public class CebolaLexica {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                MyLexer lexer = new MyLexer(new PushbackReader(new FileReader(args[0]), 1024));
                MeuParser parser = new MeuParser(lexer);
                boolean erroSintatico = false;
                while (true) {
                    try {
                        Token tok = lexer.next();
                        String nome_token = tok.getClass().getName().substring(6);
                        switch (nome_token) {
                            case "Lf":
                                System.out.println("");
                                break;
                            case "Espaco":
                                System.out.print(" ");
                                break;
                            default:
                                System.out.print(nome_token + " ");
                                break;
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
                    System.out.println("\nCodigo pertence a linguagem!!");
                } else {
                    System.err.println("\n!!O executavel nao foi gerado pois houve erros de compilacao!!");
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
