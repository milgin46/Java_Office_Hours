package week12.morning.app;

public class TestApp {
    public static void main(String[] args) {

        App app = new App(6.6);
        app.download();

        Instagram instagram = new Instagram(3.1);
        instagram.download();
        instagram.postPicture();
        //instagram.watchVideo();

        Youtube youtube = new Youtube(4.1);
        youtube.download();
        youtube.watchVideo();

    }
}
