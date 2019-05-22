package Encapsulation;

public class TestPar {
    /**
     * Passing objects by reference
     * 'i' variable is updated within the execution of 'amethod' and 'another' methods
     * that's because 'i' variable is manipulated throughout reference, so it's the same object of Test1 class which
     * is being updated by those two methods**/

    public static void main(String args[]) {
        TestPar p  = new TestPar();
        p.amethod();
    }

    public void amethod() {
        Test1 t = new Test1();
        t.i = 10;
        System.out.println("before " + t.i);
        another(t);
        System.out.println("after " + t.i);
    }

    public void another(Test1 t) {
        t.i = 20;
        System.out.println("in another " + t.i);
    }
}
