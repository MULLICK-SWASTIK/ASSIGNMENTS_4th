package Lambdas_and_functional_programming;

interface Myinter{
    double getPiValue();
}

class met implements Myinter{
    public double getPiValue(){
        return 3.1415;
    }
}

public class Lambda2 {
    public static void main(String[]args){
        Myinter f=new met();
        // Myinter f=()->3.1415;
        System.out.println("Value of π: "+f.getPiValue());
    }
}
