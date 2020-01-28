import kong.unirest.Unirest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class meanMovieAdviser {

    private static String name;
    private static String inputName = null;
    private static String temp = null;
    private static int rangeMovieLength;

    final static String emptySearchResult = "## You caused the program to shit the bed good going dumbass,\n" +
            "## One of the following is the reason why:\n" +
            "## A: The Person you searched is not on the TMDB database.\n" +
            "## B: You cant spell for shit (Most likely the reason)";
    final static String notDirString = "## Why can you not follow simple instructions you pleb.\n" +
            "## One of the following issues arose:\n" +
            "## A: The person you searched isn't a director so uncheck that u idiotic peice of human shit.\n" +
            "## B: There are no movies in the range you searched for.";
    final static String notActorString = "## Are you fucking stupid, are you purposefully trying to break this app??\n" +
            "## Plz for the love of god fix one of the following things: \n" +
            "## There are no movies in the range you are searching for. \n" +
            "## The person you searched for is not an actor or is so shit he/she" +
            " isn't worthy to be stored on the database.";


    public static Person mapPerson(String id) {
        Person person = Unirest.get(searchPersonMoviesString(id))
                .asObject(Person.class).getBody();
        Unirest.shutDown();
        return person;
    }

    public static String personsName(String userInput) {
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

    public static Result[] personSearch(String name) {
        SearchPeople response = Unirest.get(searchPersonRequestString(name))
                .asObject(SearchPeople.class).getBody();
        Unirest.shutDown();

        Result[] results = response.getResults();

        if (results.length == 0) {
            return null;
        } else
            return results;
    }


    private static String searchPersonMoviesString(String id) {

        return "https://api.themoviedb.org/3/person/" + id + "/movie_credits?language=en-US&api_key" +
                "=a13aa4b431ad2e32be56ad47bcb70469";
    }

    private static String searchPersonRequestString(String name) {
        String urlVersion = null;
        try {
            urlVersion = URLEncoder.encode(name, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return "https://api.themoviedb.org/3/search/person?include_adult=false&page=1&query=" + urlVersion +
                "&language=en-US&api_key=a13aa4b431ad2e32be56ad47bcb70469";
    }

    // checks the string to see if it contains only whitespaces and
    // letters
    private static boolean stringCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch) && ch != ' ')
                return false;
        }
        return true;
    }

    public static Cast[] getRangeCast(Person person, int high, int low) {
        java.util.List<Cast> rangedMoviesList = new ArrayList<>();
        Cast[] movies = person.getCast();

        for (Cast c : movies) {
            if ((int) c.getVote_average() >= low && (int) c.getVote_average() <= high) {
                rangedMoviesList.add(c);
            }
        }

        Cast[] rangeMovies = rangedMoviesList.toArray(new Cast[rangedMoviesList.size()]);
        rangeMovieLength = rangeMovies.length;

        if (rangeMovies.length == 0)
            return null;
        else
            return rangeMovies;
    }

    public static Crew[] getRangeCrew(Person person, int high, int low) {
        List<Crew> rangedMoviesList = new ArrayList<>();
        Crew[] movies = person.getCrew();

        for (Crew c : movies) {
            if (c.getJob().equals("Director")) {
                if ((int) c.getVote_average() >= low && (int) c.getVote_average() <= high) {
                    rangedMoviesList.add(c);
                }
            }
        }

        Crew[] rangeMovies = rangedMoviesList.toArray(new Crew[rangedMoviesList.size()]);
        rangeMovieLength = rangeMovies.length;

        if (rangeMovies.length == 0)
            return null;
        else
            return rangeMovies;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        meanMovieAdviser.name = name;
    }

    public static void setInputName(String inputName) {
        meanMovieAdviser.inputName = inputName;
    }

    public static String getTemp() {
        return temp;
    }

    public static void setTemp(String temp) {
        meanMovieAdviser.temp = temp;
    }

    public static int getRangeMovieLength() {
        return rangeMovieLength;
    }
}
