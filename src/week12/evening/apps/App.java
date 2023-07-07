package week12.evening.apps;

public class App {

    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    /*
    public App(double version){
        this.name=getClass().getSimpleName();
        this.version=version;
    }

     */


    public  void download(){
        System.out.println(name + " - "+ version +" is downloading!!!!");
    }


}
