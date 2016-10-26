package stano.home.modernplay.di.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import stano.home.modernplay.ModernPlaysApp;
import stano.home.modernplay.di.modules.AppModule;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ModernPlaysApp application();
    SharedPreferences sharedPreferences();
}
