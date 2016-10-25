package stano.home.modernplay.ui.beerlist;


import javax.inject.Inject;

import stano.home.modernplay.base.Presenter;

public class BeerListPresenter implements Presenter<BeerListView> {
    private BeerListView view;

    @Inject BeerProvider beerProvider;

    @Inject public BeerListPresenter() {}

    @Override
    public void setView(BeerListView view) {
        this.view = view;
    }

    public void loadBeers() {

    }
}
