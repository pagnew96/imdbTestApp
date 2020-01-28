import kong.unirest.Unirest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class meanMovieAdviser {

    private String name;
    private String inputName = null;
    private String temp = null;

    public meanMovieAdviser() {
        this.setTemp(null);
        this.setInputName(null);
    }

    public Person mapPerson(String id) {
        Person person = Unirest.get(searchPersonMoviesString(id))
                .asObject(Person.class).getBody();
        Unirest.shutDown();
        return person;
    }

    public String personsName(String userInput) {
        setInputName(userInput);
        final String invalidOutput = "## Letters & spaces only you fucking nonce!";
        final String newInput = "## Try again retard";

        //check if nothing is inputted or if the name has only letters and spaces in it
        if (inputName.equals("Cunts Name") | inputName.equals("")
                | inputName.replaceAll("^\\s+", "").equals("")) {
            return "## Enter something in the name input u peedo!" + "\n" + newInput;

        } else if (!stringCheck(inputName)) {
            return (invalidOutput + "\n" + newInput);

        } else {
            // Manipulates the string by removing the whitespaces (single or plural) and replacing
            // them with non word char then replaces the  non word char with a whitespace
            // this removes any errors by adding extra spaces in the input.
            setTemp(inputName.replaceAll("^\\s+", ""));
            String name = getTemp().replaceAll("[^\\w]+", " ");
            setName(name);

            return null;
        }
    }

    public Result[] personSearch(String name) {
        //System.out.println(searchPersonRequestString(name));
        SearchPeople response = Unirest.get(searchPersonRequestString(name))
                .asObject(SearchPeople.class).getBody();
        Unirest.shutDown();

        Result[] results = response.getResults();

        if (results.length == 0) {
            return null;
        } else
            return results;
    }


    private String searchPersonMoviesString(String id) {

        return "https://api.themoviedb.org/3/person/" + id + "/movie_credits?language=en-US&api_key" +
                "=a13aa4b431ad2e32be56ad47bcb70469";
    }

    private String searchPersonRequestString(String name) {
        String urlVersion = null;
        try {
            urlVersion = URLEncoder.encode(name, "UTF-8");
            //System.out.println(urlVersion);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return "https://api.themoviedb.org/3/search/person?include_adult=false&page=1&query=" + urlVersion +
                "&language=en-US&api_key=a13aa4b431ad2e32be56ad47bcb70469";
    }

    // checks the string to see if it contains only whitespaces and
    // letters
    private boolean stringCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch) && ch != ' ')
                return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
