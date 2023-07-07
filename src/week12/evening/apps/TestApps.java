package week12.evening.apps;

public class TestApps {

    public static void main(String[] args) {
        Instagram instagram=new Instagram(1.1);
        instagram.download();
        System.out.println(instagram.name);

        Youtube youtube=new Youtube(3.3);
        youtube.download();
    }
}
