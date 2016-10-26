package stano.home.modernplay.data.models;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class Beer {
    public abstract String id();
    public abstract String name();
    @Nullable public abstract String description();

    public static Beer create(String id, String name, String description) {
        return new AutoValue_Beer(id, name, description);
    }

    public static TypeAdapter<Beer> typeAdapter(Gson gson) {
        return new AutoValue_Beer.GsonTypeAdapter(gson);
    }
}
