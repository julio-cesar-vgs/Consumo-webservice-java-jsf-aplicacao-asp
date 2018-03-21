package br.com.devmedia.notas.rest;


import br.com.devmedia.notas.model.Nota;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.util.List;

public class NotaRest {

    public List<Nota> lista() {

        // comando para fazer chamada de um webservice
        Client client = Client.create();
        // comando para fazer a chamada de um endereco e chamar o item.
        WebResource webResource = client.resource("http://devmedianotesapi.azurewebsites.net/api/");
        //pegara o path do do link
        // para converter a chamada em string,devemos usar um new generitypes em list, notas.
        return webResource.path("Notes").get(new GenericType<List<Nota>>() {


        });
    }

    public static void main(String[] args) {
        NotaRest notaRest = new NotaRest();
        List<Nota> lista = notaRest.lista();
// foreach para coletar os itens que serao carregados pela lista e tranformara em java
        lista.forEach(items -> System.out.println(items.toString()));
    }

    public void obter(){

    }
}
