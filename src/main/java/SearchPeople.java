public class SearchPeople {
    private int page;
    private Result[] results;
    private int total_results;
    private int total_pages;

    public SearchPeople(int page, Result[] results, int total_results, int total_pages) {
        this.page = page;
        this.results = results;
        this.total_results = total_results;
        this.total_pages = total_pages;
    }

    public int getPage() {
        return page;
    }

    public Result[] getResults() {
        return results;
    }

    public int getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
}
