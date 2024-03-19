package Ques_4;

class Student {
    String name;
    int age, mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getMark() {
        return this.mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString(){
        return "Name: "+this.name+"\t Age: "+this.age+"\t Mark: "+this.mark;
    }

    public boolean equals(Student s){
        return (this.name.equals(s.name))&&(this.age==s.age)&&(this.mark==s.mark);
    }
}
