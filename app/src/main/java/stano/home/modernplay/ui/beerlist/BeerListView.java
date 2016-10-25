package stano.home.modernplay.ui.beerlist;


import stano.home.modernplay.base.PresenterView;

public interface BeerListView extends PresenterView{
    void showLoading();
    void hideLoading();
    void loadedBeers();
}
