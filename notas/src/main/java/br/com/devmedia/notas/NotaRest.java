package br.com.devmedia.notas;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class NotaRest {

   public void lista(){

       // comando para fazer chamada de um webservice
       Client client = Client.create();
       // comando para fazer a chamada de um endereco e chamar o item.
       WebResource webResource = client.resource("http://devmedianotesapi.azurewebsites.net/api/");
       //pegara o path do do link
       String notes = webResource.path("Notes").get(String.class);

       System.out.println(notes);
   }

    public static void main(String[] args) {
        NotaRest notaRest = new NotaRest();
        notaRest.lista();
    }
}
