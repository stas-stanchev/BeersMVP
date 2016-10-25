package stano.home.modernplay.ui.beerlist;


import javax.inject.Inject;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import stano.home.modernplay.data.api.BeerApi;

@BeerScope
public class BeerProvider {
    @Inject BeerApi beerApi;

    @Inject BeerProvider() {}

    public Subscription loadAllBeers() {
        return beerApi.getBeers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }
}
