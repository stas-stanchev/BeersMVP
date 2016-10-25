package stano.home.modernplay.base;


public interface Presenter<V extends PresenterView> {
    void setView(V view);
}
