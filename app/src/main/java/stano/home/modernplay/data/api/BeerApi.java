package stano.home.modernplay.data.api;


import retrofit2.http.GET;
import rx.Observable;
import stano.home.modernplay.data.models.Beer;

public interface BeerApi {

    @GET("beers?availableId=1")
    Observable<Response<Beer>> getBeers();
}
