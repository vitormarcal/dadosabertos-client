package br.com.vitormarcal.dadosabertosclient;

import br.com.vitormarcal.dadosabertosclient.deputados.DeputadosWebService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({
        DeputadosWebService.class

})
@Configuration
public @interface EnablesWebServiceClients {
}
