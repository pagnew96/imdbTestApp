public class genre {
    private int genre;
    private String name;

    public genre(int genre, String name) {
        this.genre = genre;
        this.name = name;
    }

    public int getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }
}
