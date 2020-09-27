package pl.com.javaex;

public class Calculator {


    public int add(int number, int number2){
        return number+number2;
    }
    public double divide(double number, double number2){
        if( number2==0){
            throw new ArithmeticException("Its not possible to divide by 0");

        }
        return number/number2;
    }

}
