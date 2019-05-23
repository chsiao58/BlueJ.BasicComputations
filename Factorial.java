 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger factorial = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;
        for (Integer i = 1; i <= value; i++)
        {
            factorial = factorial.multiply(current);
            current = current.add(BigInteger.ONE);
        }
        return factorial;
    }

}
