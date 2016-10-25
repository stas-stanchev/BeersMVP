package stano.home.modernplay.ui.beerlist;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import stano.home.modernplay.R;
import stano.home.modernplay.base.BaseActivity;

public class BeerListActivity extends BaseActivity {

    @BindView(R.id.recycler_beers) RecyclerView recyclerBeers;
    @BindView(R.id.txt_label) TextView txtLabel;

    @Inject BeerListPresenter presenter;

    @Override
    protected int layoutId() {
        return R.layout.activity_beer_list;
    }
}
