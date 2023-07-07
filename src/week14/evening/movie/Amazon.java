package week14.evening.movie;

public final class Amazon extends StreamingSite{
    public Amazon(String url, double subscriptionAmount, int numberOfAvailableMovies) {
        super(url, subscriptionAmount, numberOfAvailableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("$19.99 for amzon");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Yuo can play "+movie.getTitle()+ " on Amazon");
    }

    @Override
    void pause() {
        System.out.println("You can pause the movies on Amazon");
    }
}
