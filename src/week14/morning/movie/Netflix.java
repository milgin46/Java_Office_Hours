package week14.morning.movie;

public final class Netflix extends StreamingSite{
    /*
    - Create a final class Netflix
    inherit the StreamingSite class and implement all the methods
 */
    public Netflix(String region, double subscriptionAmount, int moviesAvailable) {
        super("www.netflix.com/" + region, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe for " + subscriptionAmount);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Starting " + movie.getTitle() + " on " + url);
    }

    @Override
    public void pause() {
        System.out.println("PAUSED " + url);
    }
}
