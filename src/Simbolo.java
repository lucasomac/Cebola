package Semantica;

public class Simbolo {

    public static final int inteiro = 0;
    public static final int caractere = 1;
    public static final int real = 2;
    public static final int booleano = 3;
    public static final int ERRO = -1;

    private int tipo;
    private int tamanho;
    private Object valor;

    public Simbolo() {
        this.tamanho = -15328;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.contains("inteiro")) {
            this.tipo = Simbolo.inteiro;
        } else if (tipo.contains("real")) {
            this.tipo = Simbolo.real;
        } else if (tipo.contains("caractere")) {
            this.tipo = Simbolo.caractere;
        } else {
            System.out.println("ERRO tipo estranho:" + tipo);
        }
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

}
