package br.com.vitormarcal.dadosabertosclient.deputados;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface DeputadosWebService {

    @GET("/")
    Call<ResponseBody> getDeputadoSummaryList(@QueryMap Map<String, Object> filter);

    @GET("/{id}")
    Call<ResponseBody> getDeputadoDetail(@Path("id") Integer idDeputado);


}
