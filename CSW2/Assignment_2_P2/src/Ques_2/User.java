package Ques_2;
// import java.util.Comparable;

public class User implements Comparable<User> {
    private int age;
    private String name;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\t Age: " + this.age;
    }

    public int compareTo(User other) {
        // if (this.age == other.age)
        // return 0;
        // else if (this.age < other.age)
        // return -1;
        // else
        // return 1;
        return this.age - other.age;
    }
}
