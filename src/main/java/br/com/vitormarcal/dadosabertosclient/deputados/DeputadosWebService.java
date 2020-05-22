package br.com.vitormarcal.dadosabertosclient.deputados;

import br.com.vitormarcal.dadosabertosclient.ExecutorWebClientService;
import br.com.vitormarcal.dadosabertosclient.result.Result;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DeputadosWebService {

    ExecutorWebClientService<Result<List<DeputadoSummary>>> executor = new ExecutorWebClientService<>();
    ObjectMapper mapper = new ObjectMapper();
    TypeReference<Map<String, Object>> type = new TypeReference<Map<String, Object>>() {};

    @GET("v2/deputados/")
    Call<Result<List<DeputadoSummary>>> callDeputadoSummaryList(@QueryMap Map<String, Object> filter);

    default Result<List<DeputadoSummary>> getDeputadoSummaryList(@NonNull DeputadosFilter filter) {
        mapper.setDefaultLeniency(true);
        Map<String, Object> mapFilter = mapper.convertValue(filter, type);
        mapFilter.values().removeIf(Objects::isNull);
        return executor.execute(callDeputadoSummaryList(mapFilter));
    }


}
