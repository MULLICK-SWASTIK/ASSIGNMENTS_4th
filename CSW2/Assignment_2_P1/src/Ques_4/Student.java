package Ques_4;
class Student implements Comparable<Student>{
    String name;
    int rn, totalMark;

    public Student(String name, int rn, int totalMark){
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String toString(){
        return "Name: "+this.name+"\tRoll no.: "+this.rn+"\tTotal marks: "+this.totalMark;
    }

    public int compareTo(Student s){
        return (this.name==s.name && this.rn==s.rn && this.totalMark==s.totalMark)?0:1;
    }

}
