
import lexer.*;
import node.*;

import java.io.*;

public class Cebola {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                CebolaLexer lexer = null;
                if (!args[0].isEmpty()) {
                    lexer = new CebolaLexer(new PushbackReader(new FileReader(args[1]), 1024));
                } else {
                    lexer = new CebolaLexer(new PushbackReader(new FileReader("entrada.txt"), 1024));
                }

                CebolaParser parser = new CebolaParser(lexer);
                boolean erroSintatico = false;
                try {
                    Start ast = parser.parse();
                    ast.toString();
                    if (!erroSintatico) {
                        System.out.println("Código Sintáticamente correto!");
                        Semantico semantica = new Semantico();
                        ast.apply(semantica);
                    }
                } catch (LexerException e) {
                    erroSintatico = true;
                    int a, b, c, d;
                    String x, y, z;
                    a = e.getMessage().indexOf(":");
                    b = e.getMessage().indexOf("[");
                    c = e.getMessage().indexOf(",");
                    d = e.getMessage().indexOf("]");
                    x = e.getMessage().substring(a + 1, a + 3);
                    y = Integer.toString(Integer.parseInt(e.getMessage().substring(b + 1, c)) - lexer.desvio);
                    z = Integer.toString(Integer.parseInt(e.getMessage().substring(c + 1, d)));
                    System.err.println("Erro léxico token deconhecido " + "[" + y + "," + z + "]:" + x);
                } catch (Exception e) {
                    if (!erroSintatico) {
                        erroSintatico = true;
                        System.err.println("Erro sintático!:" + e.getMessage());
                    }
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
