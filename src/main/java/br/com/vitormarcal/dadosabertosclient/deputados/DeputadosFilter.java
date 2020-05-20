package br.com.vitormarcal.dadosabertosclient.deputados;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DeputadosFilter {
    private Integer id;
    private String nome;
    private Integer idLegislatura;
    @Builder.Default
    private Set<String> siglaUf = new HashSet<>();
    @Builder.Default
    private Set<String> siglaPartido = new HashSet<>();
    private String siglaSexo;
    private Integer pagina;
    private Integer itens;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String ordem;
    private String ordenarPor;
    private String formato;
}
