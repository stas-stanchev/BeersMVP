package stano.home.modernplay.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import stano.home.modernplay.R;

public abstract class BaseActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inflateInner();
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    private void inflateInner() {
        ViewGroup viewGroup = ButterKnife.<ViewGroup>findById(this, R.id.container);
        View.inflate(this, layoutId(), viewGroup);
    }

    protected Toolbar getToolbar() { return toolbar; }

    /**
     * @return layout resource which is to be inflated
     */
    abstract protected int layoutId();
}
