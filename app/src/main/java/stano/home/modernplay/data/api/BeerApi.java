package stano.home.modernplay.data.api;


import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import stano.home.modernplay.data.models.Beer;

public interface BeerApi {

    @GET("beers?availableId=1")
    Observable<Response<List<Beer>>> getBeers();

    @GET("beers/{id}?availableId=1")
    Observable<Response<Beer>> getBeer(@Path("id") String id);
}
