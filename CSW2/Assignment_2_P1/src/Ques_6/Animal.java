package Ques_6;

public class Animal {
    String name, color, type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public int hashCode(){
        int hash=23;
        hash= 23*hash+name.hashCode();
        hash= 23*hash+color.hashCode();
        hash= 23*hash+type.hashCode();
        return hash;
    }

    public String toString(){
        return "Name: "+this.name+"\tColor: "+this.color+"\tType: "+this.type;
    }

}
