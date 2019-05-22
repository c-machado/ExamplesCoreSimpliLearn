package staticExample;

public class Student {
    int rollNumber;
    String name;
    static String college = "MGT";

    Student(int roll, String studentName){
        this.rollNumber = roll;
        this.name = studentName;
    }

    static void change(){
        college = "MGIT";
    }

    void display(){
        System.out.println("rollnumber " +rollNumber + "name: " + name + "college: " + college);
    }

}
