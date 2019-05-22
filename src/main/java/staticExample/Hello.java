package staticExample;

public class Hello {
    public static void main(String args[]){
        Student.change();
        Student s1 = new Student(111, "caro");
        Student s2 = new Student(222, "machado");
        s1.display();
        Student.college = "VGDI";
        s2.display();
        s1.display();

    }

}
