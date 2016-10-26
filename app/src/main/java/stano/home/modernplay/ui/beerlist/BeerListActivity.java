package stano.home.modernplay.ui.beerlist;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import stano.home.modernplay.ModernPlaysApp;
import stano.home.modernplay.R;
import stano.home.modernplay.base.BaseActivity;
import stano.home.modernplay.data.models.Beer;
import stano.home.modernplay.utils.ListUtils;

public class BeerListActivity extends BaseActivity implements BeerListView {

    @BindView(R.id.recycler_beers) RecyclerView recyclerBeers;
    @BindView(R.id.txt_label) TextView txtLabel;

    @Inject BeerListPresenter presenter;
    private BeerListComponent beerListComponent;

    @Override
    protected void doInject() {
        beerListComponent = DaggerBeerListComponent.builder()
                .networkComponent(ModernPlaysApp.getNetworkComponent(this))
                .build();
        beerListComponent.inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.setView(null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        beerListComponent = null;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_beer_list;
    }

    @Override
    public void showLoading() {
        txtLabel.setText("Loading...");
    }

    @Override
    public void hideLoading() {
        txtLabel.setText("");
    }

    @Override
    public void onBeersLoaded(List<Beer> beers) {
        txtLabel.setText(ListUtils.mergeStrings(",\n", beers));
    }

    @Override
    public void onLoadingError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_load_beers)
    @Override
    public void loadBeers() {
        presenter.loadBeers();
    }
}
