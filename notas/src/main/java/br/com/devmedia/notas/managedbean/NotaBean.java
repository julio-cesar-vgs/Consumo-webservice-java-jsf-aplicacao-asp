package br.com.devmedia.notas.managedbean;

import br.com.devmedia.notas.model.Nota;
import br.com.devmedia.notas.rest.NotaRest;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

//session scoped, vai existir ate aquela requisao exista
@SessionScoped
@ManagedBean
public class NotaBean {

    private List<Nota> notas;

    public List<Nota> getNotas() {
        return notas;
    }

    //Linha 10: Anotação que define que o método será chamado assim que o bean for inicializado;
    @PostConstruct
    public void init() {
        NotaRest notaRest = new NotaRest();
        notas = notaRest.lista();
    }
}
