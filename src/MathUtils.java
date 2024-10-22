//Building and Testing a Java Utility Class 
//MathUtils.java

public class MathUtils{
    //Addition Method: Create a static method 
    //named add that takes two integers and returns their sum.
    public static int add(int a, int b){
        return a + b;
    }

    //Subtraction Method: Create a static method named subtract that takes two integers 
    //and returns the result of subtracting the second from the first.
    public static int subtract(int b, int a){
        return b - a;
    }
    //Multiplication Method: Create a static method named multiply that takes two integers and returns their product.
    public static int multiply(int a, int b){
        return a*b;
    }
    //Division Method: Create a static method named divide that 
    //takes two integers and returns their quotient as a double. Include error handling to avoid division by zero, returning Double.NaN in such cases.
    public static double divide(int a, int b){
        if (b==0){
            System.out.println("Error, can not divide from 0.");
            //NaN is not a number
            return Double.NaN;
        }
        else return (double)a/b;
    }
}