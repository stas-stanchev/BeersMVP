package stano.home.modernplay;

import android.app.Application;

import stano.home.modernplay.di.components.DaggerNetworkComponent;
import stano.home.modernplay.di.components.NetworkComponent;
import stano.home.modernplay.di.modules.AppModule;
import stano.home.modernplay.di.modules.NetworkModule;

public class ModernPlaysApp extends Application {
    private NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerNetworkComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("http://api.brewerydb.com/v2/", "2654d5ca3137d6aae13a8f91b365dd93")).build();
    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
