package week14.evening.movie;

public final class Movie {
   private String title;
   private int rate;
   private int duration;
    private int year;

    public Movie(String title, int rate, int duration, int year) {
     setDuration(duration);
     setRate(rate);
     setTitle(title);
     setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rate=" + rate +
                ", duration=" + duration +
                ", year=" + year +
                '}';
    }
}
