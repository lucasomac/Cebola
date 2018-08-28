public class Simbolo {

    public static final int INTEIRO = 0;
    public static final int CARACTERE = 1;
    public static final int REAL = 2;
    public static final int BOOLEANO = 3;
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
            this.tipo = Simbolo.INTEIRO;
        } else if (tipo.contains("real")) {
            this.tipo = Simbolo.REAL;
        } else if (tipo.contains("caractere")) {
            this.tipo = Simbolo.CARACTERE;
        } else {
            System.out.println("ERRO tipo doido:" + tipo);
        }
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

}
