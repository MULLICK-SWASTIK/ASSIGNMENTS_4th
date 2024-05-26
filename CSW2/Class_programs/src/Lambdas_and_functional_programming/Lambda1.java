package Lambdas_and_functional_programming;

interface interf{
    public void m1();
}

// class Demo implements interf{
//     public void m1(){
//         System.out.println("m1 implementation");
//     }
// }

public class Lambda1 {
    public static void main(String[]srgs){
        // interf i=new Demo();
        interf i=()->System.out.println("m1 implementation");
        i.m1();
    }
}
