package br.com.devmedia.notas.managedbean;

import br.com.devmedia.notas.model.Nota;
import br.com.devmedia.notas.rest.NotaRest;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Collections;
import java.util.List;

//session scoped, vai existir ate aquela requisao exista
@SessionScoped
@ManagedBean
public class NotaBean {

    private Integer id;
    private Nota nota;
    private List<Nota> notas;
    NotaRest notaRest = new NotaRest();

    //Linha 10: Anotação que define que o método será chamado assim que o bean for inicializado;
    @PostConstruct
    public void init() {
        notaRest = new NotaRest();
        notas = notaRest.lista();
    }

    public String exibir(Nota nota) {
        this.nota = nota;
        return "detalhes";
    }

    public void initDetalhes(){
        this.nota = notaRest.obter(id);
    }

    // metodo para editar e atualizar os dados
    public String editar(){
        notaRest.atualizar(this.nota);
        this.notas = notaRest.lista();
        return "index";

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }


}
