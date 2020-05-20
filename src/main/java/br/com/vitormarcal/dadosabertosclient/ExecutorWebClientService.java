package br.com.vitormarcal.dadosabertosclient;

import retrofit2.Call;
import retrofit2.Response;

public class ExecutorWebClientService<T> {


    public T execute(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body();
            } else {
                String raw = response.toString();
                throw new RuntimeException("Retorno diferente de 200: " + raw);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}