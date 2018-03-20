package br.com.devmedia.notas;

import com.owlike.genson.annotation.JsonProperty;

public class Nota {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Body")
    private String body;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
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
