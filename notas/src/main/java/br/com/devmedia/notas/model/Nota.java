package br.com.devmedia.notas.model;

import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.annotation.JsonProperty;

public class Nota {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Body")
    private String body;

    @JsonIgnore
    public Integer getId() {
        return id;
    }

    @JsonIgnore
    public String getTitle() {
        return title;
    }

    @JsonIgnore
    public String getBody() {
        return body;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Identificação: ").append(id);
        sb.append(", Titulo: '").append(title).append('\'');
        sb.append(", Corpo: '").append(body).append('\'');
        return sb.toString();
    }

}
