package Employee1;

class Employee implements Comparable<Employee>{
    String empName;
    int empId;
    Employee(String empName, int empId){
        this.empId=empId;
        this.empName = empName;
    }

    public int compareTo(Employee e){
        return this.empId-e.empId;
    }

    public String toString(){
        return this.empName+":"+this.empId;
    }
}
