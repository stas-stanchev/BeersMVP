package stano.home.modernplay.data.api;


public class Response<T> {
    private String status;
    private int numberOfPages;
    private int currentPage;
    private T data;

    public String getStatus() {
        return status;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
