package br.com.vitormarcal.dadosabertosclient.response;

import lombok.Value;

@Value
public class Link {
    private String rel;
    private String ref;
}