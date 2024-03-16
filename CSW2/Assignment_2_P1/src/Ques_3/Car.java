package Ques_3;

class Car implements Comparable<Car>{
    String model, color;
    int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public int compareTo(Car c){
        if(this.speed < c.speed)
            return -1;
        else if(this.speed == c.speed)
            return 0;
        else
            return 1;
    }

    public String toString(){
        return "Car: "+this.model+"\tColor: "+this.color+"\tSpeed: "+this.speed;
    }

}
