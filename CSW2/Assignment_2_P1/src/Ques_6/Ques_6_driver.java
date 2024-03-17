package Ques_6;

public class Ques_6_driver {
    public static void main(String[]args){
        Animal cat=new Animal("Cat", "Black","pet");
        Animal dog=new Animal("Dog", "White","pet");
        Animal tiger=new Animal("Tiger", "Orange and black","wild");
        System.out.println("Animals:-\n"+cat+"\n"+dog+"\n"+tiger);
        System.out.println("\nCat: "+cat.hashCode());
        System.out.println("Dog: "+dog.hashCode());
        System.out.println("Tiger: "+tiger.hashCode());
    }
}
//OUTPUT
// Animals:-
// Name: Cat       Color: Black    Type: pet
// Name: Dog       Color: White    Type: pet
// Name: Tiger     Color: Orange and black Type: wild

// Cat: 1514226271  
// Dog: 1958466027  
// Tiger: -426562634