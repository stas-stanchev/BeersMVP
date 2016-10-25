package stano.home.modernplay.ui.beerlist;

import dagger.Component;
import stano.home.modernplay.di.components.NetworkComponent;
import stano.home.modernplay.di.modules.NetworkModule;

@BeerScope
@Component(modules = NetworkModule.class, dependencies = NetworkComponent.class)
public interface BeerListComponent {
}
