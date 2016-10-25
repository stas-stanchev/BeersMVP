package stano.home.modernplay.di.components;

import javax.inject.Singleton;

import dagger.Component;
import stano.home.modernplay.di.modules.AppModule;
import stano.home.modernplay.di.modules.NetworkModule;

@Singleton
@Component(modules = { AppModule.class, NetworkModule.class})
public interface NetworkComponent {
}
