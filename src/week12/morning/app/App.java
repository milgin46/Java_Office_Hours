package week12.morning.app;

public class App {
    /*
    App [inheritance, constructors]

    Create an App class

        - create variables:
            name (app name), version

        - create a constructor to initialize the variables

        - create method:
            download()
                Example output: prints $name is downloading version $version
     */

    String name;
    double version;

    public App(double version){
        this.name = getClass().getSimpleName();
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }

}
