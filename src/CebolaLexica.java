
import java.io.FileReader;
import java.io.PushbackReader;
import node.Token;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class CebolaLexica {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                Aninhado lexer = new Aninhado(new PushbackReader(new FileReader(args[0]), 1024));
                while (true) {
                    try {

                        Token tok = lexer.next();
                        String nome_token = tok.getClass().getName().substring(6);
                        System.out.print(nome_token + " ");
                        if (nome_token.equals("Lf")) {
                            System.out.println("");
                        }

                        if (tok.getText() == "") {
                            break;
                        }
                    } catch (Exception e) {
                        lexer.houveProblema = true;
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                if (!lexer.houveProblema) {
                    System.out.println("\nc�digo pertence a linguagem!!");
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
