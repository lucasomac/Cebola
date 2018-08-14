/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import lexer.Lexer;
import parser.Parser;

/**
 *
 * @author LUCAS DE OLIVEIRA MACEDO
 */
public class CebolaParser extends Parser{

    protected int last_pos = -1;
    protected int last_line = -1;

    public CebolaParser(Lexer lexer) {

        super(lexer);
    }

    public int getLine() {
        return this.last_line;
    }

    public int getPos() {
        return this.last_pos;
    }
}
