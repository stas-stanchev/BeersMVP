package stano.home.modernplay.di.modules;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import stano.home.modernplay.ModernPlaysApp;

@Module
public class AppModule {
    ModernPlaysApp application;

    public AppModule(ModernPlaysApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public ModernPlaysApp provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(ModernPlaysApp application) {
        return application.getSharedPreferences(application.getPackageName().toString(), Context.MODE_PRIVATE);
    }
}
