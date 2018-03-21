package br.com.devmedia.notas.rest;


import br.com.devmedia.notas.model.Nota;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.util.List;

public class NotaRest {

    private Client client;
    private WebResource webResource;

    public NotaRest() {
        client = Client.create();
        client.resource("http://devmedianotesapi.azurewebsites.net/api/");
    }

    public List<Nota> lista() {
        //pegara o path do do link
        // para converter a chamada em string,devemos usar um new generitypes em list, notas.
        return webResource.path("Notes").get(new GenericType<List<Nota>>() {
        });
    }

    public static void main(String[] args) {
        NotaRest notaRest = new NotaRest();
        List<Nota> lista = notaRest.lista();
// foreach para coletar os itens que serao carregados pela lista e tranformara em java
        // lista.forEach(items -> System.out.println(items.toString()));

        notaRest.obter(2510);
    }

    public Nota obter(Integer id) {
        return webResource.path("Notes").path(id.toString()).get(new GenericType<Nota>() {
        });
    }
}
