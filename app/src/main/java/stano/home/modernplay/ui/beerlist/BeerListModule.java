package stano.home.modernplay.ui.beerlist;

import dagger.Module;
import dagger.Provides;
import stano.home.modernplay.data.api.BeerApi;

@Module
public class BeerListModule {

    @Provides
    public BeerListPresenter provideBeerListPresenter(BeerProvider beerProvider) {
        return new BeerListPresenter(beerProvider);
    }

    @Provides
    public BeerProvider provideBeerProvider(BeerApi beerApi) {
        return new BeerProvider(beerApi);
    }
}
