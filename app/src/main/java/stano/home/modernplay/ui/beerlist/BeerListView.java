package stano.home.modernplay.ui.beerlist;


import java.util.List;

import stano.home.modernplay.base.PresenterView;
import stano.home.modernplay.data.models.Beer;

public interface BeerListView extends PresenterView {
    void showLoading();
    void hideLoading();
    void onBeersLoaded(List<Beer> beers);
    void onLoadingError(String error);
}
