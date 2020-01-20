public class Result {
    private float popularity;
    private String Known_for_department;
    private String name;
    private int id;
    private String profile_path;
    private boolean adult;
    private Known_for[] known_for;
    private int gender;

    public Result(float popularity, String known_for_department, String name,
                  int id, String profile_path, boolean adult,
                  Known_for[] known_for, int gender) {
        this.popularity = popularity;
        Known_for_department = known_for_department;
        this.name = name;
        this.id = id;
        this.profile_path = profile_path;
        this.adult = adult;
        this.known_for = known_for;
        this.gender = gender;
    }

    public float getPopularity() {
        return popularity;
    }

    public String getKnown_for_department() {
        return Known_for_department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getProfile_path() {
        return profile_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public Known_for[] getKnown_for() {
        return known_for;
    }

    public int getGender() {
        return gender;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public void setKnown_for_department(String known_for_department) {
        Known_for_department = known_for_department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfile_path(String profile_path) {
        this.profile_path = profile_path;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setKnown_for(Known_for[] known_for) {
        this.known_for = known_for;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
