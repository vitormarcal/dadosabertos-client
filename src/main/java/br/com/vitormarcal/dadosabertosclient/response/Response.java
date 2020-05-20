package br.com.vitormarcal.dadosabertosclient.response;

import lombok.Value;

import java.util.Set;

@Value
public class Response<T> {
    private T dados;
    private Set<Link> links;
}
