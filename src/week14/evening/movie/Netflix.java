package week14.evening.movie;

public final class Netflix extends StreamingSite{
    public Netflix(String url, double subscriptionAmount, int numberOfAvailableMovies) {
        super(url, subscriptionAmount, numberOfAvailableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("$19.99 for Netflix");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Yuo can play "+movie.getTitle()+ " on Netflix");
    }

    @Override
    void pause() {
        System.out.println("You can pause the movies on Netflix");
    }
}
