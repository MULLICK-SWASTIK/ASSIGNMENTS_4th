package Ques_1;
public class Main {
    public static void main(String[]args){
        Student<String> student1=new Student<String>("Swastik Mullick","23",21);
        System.out.println(student1);
        Student<Integer> student2=new Student<Integer>("Ayushman Lal",62,20);
        System.out.println(student2);
    }
}
//OUTPUT
// Name: Swastik Mullick   Roll no.: 23    Age: 21
// Name: Ayushman Lal      Roll no.: 62    Age: 20