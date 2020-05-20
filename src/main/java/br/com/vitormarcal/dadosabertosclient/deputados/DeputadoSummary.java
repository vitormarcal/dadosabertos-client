package br.com.vitormarcal.dadosabertosclient.deputados;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class DeputadoSummary {
    private Integer id;
    private String uri;
    private String nome;
    private String siglaPartido;
    private String uriPartido;
    private String siglaUf;
    private Integer idLegislatura;
    private String urlFoto;
    private String email;
}
