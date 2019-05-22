package Encapsulation;

public class Par1 {

    /**
     * Passing primitives instead of objects to a method is considered passing by value, then the variable won't be affect
     * outside each implementation**/

    public static void main (String args []){
        Par1 p = new Par1();
        p.amethod();
    }

    public void amethod(){
        int i = 10;
        System.out.println(" before " + i);
        another(i);
        System.out.println(" after " + i);

    }

    public void another(int _i){
        _i += 10;
        System.out.println(" in " + _i);
    }
}
