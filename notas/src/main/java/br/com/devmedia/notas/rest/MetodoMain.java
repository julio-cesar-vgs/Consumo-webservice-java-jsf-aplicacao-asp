package br.com.devmedia.notas.rest;

import br.com.devmedia.notas.model.Nota;

import java.util.List;

public class MetodoMain {
    public static void main(String[] args) {
        NotaRest notaRest = new NotaRest();
        Nota nota = new Nota();
        // recuperar as notas
        //List<Nota> lista = notaRest.lista();
        // lista.forEach(items -> System.out.println(items.toString()));

        // funcao para chamar um id
        // System.out.println(notaRest.obter(2527));


        nota.setId(2528 );
        nota.setBody("Teste Devmedia JSF");
        nota.setTitle("Vamos que vamos");
        notaRest.atualizar(nota);
    }
}
