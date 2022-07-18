package main;

import java.time.LocalDate;

public class AplicacaoLocal {

    public static void main(String[] args) {
        double valor = 0.00;
        Integer idade = 0;
        Integer dias = 0;
        Integer meses = 0;
        Integer anos = 0;
        LocalDate dataAtual = LocalDate.now();

        idade = 42;
        dias  = idade * 365;
        meses = idade * 12;
        anos  = idade * 1;

        System.out.println("Resultado de dias vividos: " + dias);
        System.out.println("Resultado de meses vividos: " + meses);
        System.out.println("Resultado de anos vividos: " + anos);

        valor = dias / idade;
        System.out.println("Contra prova do resulstado de dias vividos: " + valor);

        valor = meses / idade;
        System.out.println("Contra prova do resulstado de meses vividos: " + valor);

        valor = anos / idade;
        System.out.println("Contra prova do resulstado de anos vividos: " + valor);
    }
}
