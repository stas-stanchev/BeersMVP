package stano.home.modernplay.di.components;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import stano.home.modernplay.data.api.BeerApi;
import stano.home.modernplay.di.modules.AppModule;
import stano.home.modernplay.di.modules.NetworkModule;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetworkComponent extends AppComponent {
    BeerApi beerApi();
    Retrofit retrofit();
    Gson gson();
}
