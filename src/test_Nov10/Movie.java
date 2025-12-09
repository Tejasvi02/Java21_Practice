package test_Nov10;


public class Movie{
    private String title;
    private String genre;
    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }
   //accessors not shown
}

//and
//
//Stream<Movie> sm = Stream.of( new Movie("a1", "a"),
//                              new Movie("a2", "a"),
//                              new Movie("b1", "b"), new Movie("c1", null));


//Which of the following code fragments will get you the map of all the genres 
//and the number of movies belonging to each genre?