package br.com.devmedia.notas.rest;

import com.owlike.genson.Genson;

import javax.ws.rs.ext.ContextResolver;

public class GensonProvider implements ContextResolver<Genson>{
    // quando for chamado o getContext o genson nao deixa criar atributo null
    private Genson genson = new Genson.Builder().setSkipNull(true).create();


    @Override
    public Genson getContext(Class<?> type) {
        return genson;
    }
}
