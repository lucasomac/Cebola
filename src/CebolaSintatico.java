/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileReader;
import java.io.PushbackReader;
import lexer.LexerException;
import node.Start;

/**
 *
 * @author LUCAS DE OLIVEIRA MACEDO
 */
public class CebolaSintatico {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                CebolaLexer lexer = new CebolaLexer(new PushbackReader(new FileReader(args[0]), 1024));
                CebolaParser parser = new CebolaParser(lexer);
                boolean erroSintatico = false;

                while (true) {
                    try {
                        if ("".equals(lexer.next().getText())) {
                            break;
                        }
                        Start ast = parser.parse();
                        if (!erroSintatico) {
                            System.out.println("Código sintaticamente correto!");
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
