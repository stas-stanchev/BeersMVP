package stano.home.modernplay.ui.beerlist;

import dagger.Component;
import stano.home.modernplay.di.components.NetworkComponent;
import stano.home.modernplay.di.scopes.BeerScope;

@BeerScope
@Component(modules = BeerListModule.class, dependencies = NetworkComponent.class)
public interface BeerListComponent {
    void inject(BeerListActivity activity);
}
