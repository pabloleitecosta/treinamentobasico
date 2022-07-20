package main;

import java.util.Date;

public class AplicacaoLocal {

    private static final String VALOR_NAO_PODE_SER_ALTERADO = "Valores preenchidos: "; // STATAICA OU CONSTRAINT

    public static void main(String[] args) {
        metodoImprimeInteiro();
        metodoImprimeData();
        metodoImprimeDouble();
        metodoImprimeEscrito();
    }


    static void metodoImprimeInteiro(){
        Integer valorInteiro = 0; // INTEIRO
        valorInteiro = 235467;
        Integer valorNegativo = -22;
        System.out.println(VALOR_NAO_PODE_SER_ALTERADO+"Inteiro "+ valorInteiro);
    }

    static void metodoImprimeDouble(){
        double valoresFracionados = 0.00; // Moeda fracionados
        valoresFracionados = 321.86;
        System.out.println(VALOR_NAO_PODE_SER_ALTERADO+"Fracionado "+valoresFracionados);
    }

    static void metodoImprimeEscrito(){
        String valorEscrito = ""; // ESCRITA
        valorEscrito = "JOZIAN 3456789@$%¨&*()_{^:>`l";
        System.out.println(VALOR_NAO_PODE_SER_ALTERADO+"Escrito "+valorEscrito);
    }

    static void metodoImprimeData() {
        Date dataAtual = new Date(); // Data
        dataAtual = new Date("01/01/2021");
        System.out.println(VALOR_NAO_PODE_SER_ALTERADO+"Data "+dataAtual);
    }


}
