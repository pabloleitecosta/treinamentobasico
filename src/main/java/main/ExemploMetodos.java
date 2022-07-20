package main;

import java.util.Date;



public class ExemploMetodos  {

    private static final String VALOR_NAO_PODE_SER_ALTERADO = "VALOR CONSTRAINT"; // STATAICA OU CONSTRAINT
    public Integer valorInteiro = 0; // INTEIRO
    public String valorEscrito = ""; // ESCRITA
    private double valoresFracionados = 0.00; // Moeda fracionados
    private Date dataAtual = new Date(); // Data

    private void metodoPrivado() {

        System.out.println("Este método é privado");
    }

    public void metodoPublico() {
        System.out.println("Esse método é publico");
    }
}
