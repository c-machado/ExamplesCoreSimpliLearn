package Inheritance;

public class Employee extends Person {

    float salary;

    public Employee(String _name, float _salary){
        super(_name);
        this.salary = _salary;
    }
    public void display(){
        System.out.println(name  + " " + salary);
    }
}
