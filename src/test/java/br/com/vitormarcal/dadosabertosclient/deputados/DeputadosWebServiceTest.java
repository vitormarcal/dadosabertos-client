package br.com.vitormarcal.dadosabertosclient.deputados;

import br.com.vitormarcal.dadosabertosclient.ExecutorWebClientService;
import br.com.vitormarcal.dadosabertosclient.result.Result;
import org.junit.jupiter.api.Test;
import retrofit2.Call;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DeputadosWebServiceTest {

    DeputadosWebService deputadosWebService = new DeputadosConfiguration().deputadosService();

    @Test
    void getDeputadoSummaryList() {
        ExecutorWebClientService<Result<List<DeputadoSummary>>> executor = new ExecutorWebClientService<>();
        Call<Result<List<DeputadoSummary>>> deputadoSummaryList = deputadosWebService.callDeputadoSummaryList(Collections.singletonMap("formato", "json"));
        Result<List<DeputadoSummary>> result = executor.execute(deputadoSummaryList);

        assertNotNull(result);
        assertNotNull(result.getDados());
        assertFalse(result.getDados().isEmpty());
        assertNotNull(result.getLinks());
        assertFalse(result.getLinks().isEmpty());
    }

    @Test
    void getDeputadoSummaryListTyped() {
        DeputadosFilter filter = DeputadosFilter.builder()
                .formato("json")
                .build();
        Result<List<DeputadoSummary>> result = deputadosWebService.getDeputadoSummaryList(filter);

        assertNotNull(result);
        assertNotNull(result.getDados());
        assertFalse(result.getDados().isEmpty());
        assertNotNull(result.getLinks());
        assertFalse(result.getLinks().isEmpty());
    }
}