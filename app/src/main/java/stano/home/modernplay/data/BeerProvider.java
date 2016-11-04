package stano.home.modernplay.data;


import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import stano.home.modernplay.data.api.BeerApi;
import stano.home.modernplay.data.models.Beer;
import stano.home.modernplay.di.scopes.BeerScope;

@BeerScope
public class BeerProvider {
    private BeerApi beerApi;

    @Inject
    public BeerProvider(BeerApi beerApi) {
        this.beerApi = beerApi;
    }

    public Observable<List<Beer>> loadAllBeers() {
        return beerApi.getBeers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(response -> Observable.from(response.getData()).toList());
    }
}
