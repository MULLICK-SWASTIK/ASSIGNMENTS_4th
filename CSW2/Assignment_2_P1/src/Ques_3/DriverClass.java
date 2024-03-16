package Ques_3;
public class DriverClass {
    public static void main(String[]args){
        Car car1=new Car("Ford Shelby GT 500 2015","Dark blue",235);
        Car car2=new Car("Ford GT 40 1970","Steel gray",270);
        System.out.println(car1+"\n"+car2);
        System.out.println("\nGT 40 faster than GT 500?\n"+(car2.compareTo(car1)==1? "true":"false"));
    }
}//OUTPUT
// Car: Ford Shelby GT 500 2015    Color: Dark blue        Speed: 235
// Car: Ford GT 40 1970    Color: Steel gray       Speed: 270

// GT 40 faster than GT 500?
// true
