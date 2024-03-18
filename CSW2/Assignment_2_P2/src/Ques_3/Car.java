package Ques_3;

class Car implements Comparable<Car>{
    private int ModalNo, stock;
    private String name;

    public Car(String name, int stock, int ModalNo) {
        this.name = name;
        this.stock = stock;
        this.ModalNo = ModalNo;
    }

    public int compareTo(Car car) {
        if (this.stock < car.stock)
            return -1;
        else if (this.stock == car.stock)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return "Name: " + this.name + "\t Modal no.: " + this.ModalNo + "\t Stock: " + this.stock;
    }

}
