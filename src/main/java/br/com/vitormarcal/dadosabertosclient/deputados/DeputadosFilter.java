package br.com.vitormarcal.dadosabertosclient.deputados;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class DeputadosFilter {
    private Integer id;
    private String nome;
    private Integer idLegislatura;
    private Set<String> siglaUf;
    private Set<String> siglaPartido;
    private String siglaSexo;
    private Integer pagina;
    private Integer itens;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String ordem;
    private String ordenarPor;
}
