package stano.home.modernplay.ui.landing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.Arrays;

import butterknife.BindView;
import rx.Observable;
import stano.home.modernplay.R;
import stano.home.modernplay.base.BaseActivity;

/**
 * Created by Stanislav on 5/15/2016.
 */
public class BeerListActivity extends BaseActivity {

    @BindView(R.id.recycler_beers) RecyclerView recyclerBeers;
    @BindView(R.id.txt_label) TextView txtLabel;

    @Override
    protected int layoutId() {
        return R.layout.activity_beer_list;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Observable.just(Arrays.asList("One", "Two", "Three", "Four", "Five"))
                .flatMap(numbers -> Observable.from(numbers))
                .map(s -> s + "\n")
                .subscribe(s -> txtLabel.append(s));
    }
}
