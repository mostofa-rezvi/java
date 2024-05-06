package math;

import java.math.BigInteger;

public class Factorial {

    int number;

    public Factorial() {
    }
    
    public Factorial(int number){
        this.number = number;
    }
    
    public BigInteger getFactorial(){
        
//        BigInteger factorial = BigInteger.ONE;
        BigInteger factorial = new BigInteger("5");  //for any other number 
        
        for(int i = 1; i <= number; i++){
            factorial = factorial.multiply(new BigInteger(i+" "));
        }
        return factorial;
    }
}
