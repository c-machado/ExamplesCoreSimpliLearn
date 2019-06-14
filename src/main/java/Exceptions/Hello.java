package Exceptions;

public class Hello {

    public static void main (String[] args){
        try {
            int i = 10/0;
            System.err.println(i);

        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }
}
