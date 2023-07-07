package week14.morning.movie;

public final class Amazon extends StreamingSite{
    /*
        - Create a final class Amazon
        inherit the StreamingSite class and implement all the methods
     */
    public Amazon(double subscriptionAmount, int moviesAvailable) {
        super("www.amazon.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscription to amazon prime");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Playing " + movie.getTitle() + " on amazon video");
    }

    @Override
    public void pause() {
        System.out.println("Paused with space");
    }
}
