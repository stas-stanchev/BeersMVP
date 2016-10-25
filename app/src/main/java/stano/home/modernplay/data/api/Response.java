package stano.home.modernplay.data.api;


import rx.Observable;

public class Response<T> {
    private String status;
    private int numberOfPages;
    private int currentPage;
    private Observable<T> data;

    public String getStatus() {
        return status;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public Observable<T> getData() {
        return data;
    }
}
