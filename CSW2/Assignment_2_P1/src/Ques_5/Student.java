package Ques_5;

class Student implements Comparable<Student>{
    String name;
    int rn, mark;

    public Student(String name, int rn, int mark) {
        this.name = name;
        this.rn = rn;
        this.mark = mark;
    }

    public String toString(){
        return "Name: " + this.name + "\tRoll no.: " + this.rn + "\tMarks: " + this.mark;
    }

    public int compareTo(Student other){
        if(this.rn<other.rn)
            return -1;
        else if (this.rn==other.rn)
            return 0;
        else
            return 1;
    }

}
