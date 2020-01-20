public class Known_for {
    private int vote_count;
    private int id;
    private boolean video;
    private String media_type;
    private float vote_average;
    private String title;
    private String release_date;
    private String original_language;
    private String original_title;
    private int[] genre_id;
    private String backdrop_path;
    private boolean adult;
    private String overview;
    private String poster_path;

    public Known_for(int vote_count, int id, boolean video, String media_type,
                     float vote_average, String title, String release_date,
                     String original_language, String original_title,
                     int[] genre_id, String backdrop_path, boolean adult,
                     String overview, String poster_path) {
        this.vote_count = vote_count;
        this.id = id;
        this.video = video;
        this.media_type = media_type;
        this.vote_average = vote_average;
        this.title = title;
        this.release_date = release_date;
        this.original_language = original_language;
        this.original_title = original_title;
        this.genre_id = genre_id;
        this.backdrop_path = backdrop_path;
        this.adult = adult;
        this.overview = overview;
        this.poster_path = poster_path;
    }

    public int getVote_count() {
        return vote_count;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public String getMedia_type() {
        return media_type;
    }

    public float getVote_average() {
        return vote_average;
    }

    public String getTitle() {
        return title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public int[] getGenre_id() {
        return genre_id;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setGenre_id(int[] genre_id) {
        this.genre_id = genre_id;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
