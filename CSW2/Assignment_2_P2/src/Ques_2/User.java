package Ques_2;
// import java.util.Comparable;

public class User implements Comparable{
    private int age;
    private String name;
    public User(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString(){
        return "("+this.name+", "+this.age+")";
    }

    public int compareTo(User other){
        return this.age-other.age;
    }
}
