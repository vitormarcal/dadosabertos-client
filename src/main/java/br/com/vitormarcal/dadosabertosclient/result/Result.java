package br.com.vitormarcal.dadosabertosclient.result;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
public class Result<T> {
    private T dados;
    private Set<Link> links;
}
