package stano.home.modernplay.data.api;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit RETROFIT;
    private static Map<String, Object> SERVICES;
    private static OkHttpClient CLIENT;

    static {
        CLIENT = new OkHttpClient.Builder()
                .build();
        RETROFIT = new Retrofit.Builder()
                .baseUrl("http://api.brewerydb.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SERVICES = new HashMap<>();
    }

    public static BeerApi getBeerApi() {
        return (BeerApi) getApi(BeerApi.class);
    }

    private static Object getApi(Class api) {
        String simpleName = api.getSimpleName();
        if (SERVICES.containsKey(simpleName)) {
            SERVICES.put(simpleName, RETROFIT.create(BeerApi.class));
        }

        return SERVICES.get(simpleName);
    }
}
