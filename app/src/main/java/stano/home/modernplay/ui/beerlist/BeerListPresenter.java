package stano.home.modernplay.ui.beerlist;


import javax.inject.Inject;

import stano.home.modernplay.base.Presenter;
import stano.home.modernplay.di.scopes.BeerScope;

@BeerScope
public class BeerListPresenter implements Presenter<BeerListView> {
    private BeerListView view;

    private BeerProvider beerProvider;

    @Inject
    public BeerListPresenter(BeerProvider beerProvider) {
        this.beerProvider = beerProvider;
    }

    @Override
    public void setView(BeerListView view) {
        this.view = view;
    }

    public void loadBeers() {
        view.showLoading();
        beerProvider.loadAllBeers().subscribe(beersResponse -> view.onBeersLoaded(beersResponse.getData()),
                                              error -> view.onLoadingError(error.getMessage()),
                                              () -> view.hideLoading());
    }
}
