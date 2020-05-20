package br.com.vitormarcal.dadosabertosclient.deputados;

import br.com.vitormarcal.dadosabertosclient.ExecutorWebClientService;
import br.com.vitormarcal.dadosabertosclient.result.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DeputadosWebService {

    ExecutorWebClientService<Result<List<DeputadoSummary>>> executor = new ExecutorWebClientService<>();
    ObjectMapper mapper = new ObjectMapper();

    @GET("v2/deputados/")
    Call<Result<List<DeputadoSummary>>> callDeputadoSummaryList(@QueryMap Map<String, Object> filter);

    @GET("v2/deputados/{id}")
    Call<ResponseBody> callDeputadoDetail(@Path("id") Integer idDeputado);

    default Result<List<DeputadoSummary>> getDeputadoSummaryList(DeputadosFilter filter) {

        return executor.execute(
                callDeputadoSummaryList(
                        mapper.convertValue(filter, Map.class)
                ));
    }


}
