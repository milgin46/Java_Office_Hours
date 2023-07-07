package week07.evening.task4;

public class Recipe {

    String name;
    String ingredients;
    int servingSize;
    double cost;
    //if you are using same parameter name  with instance variables we need to use this keyword in order to separate
    public  void  setInfo(String name,String ingredients,int servingSize,double cost){

        this.name=name;
        this.ingredients=ingredients;
        this.servingSize=servingSize;
       this.cost=cost;
    }

    public  double costPerPerson(){
        return  cost/servingSize;
    }


    public String toString() {
        return "Recipe for "+name+" will require these ingredients:\n" +
               ingredients+ "\n" +
                "        This dish will serve "+servingSize+" and cost a total of $"+cost+" to make";
    }





}
