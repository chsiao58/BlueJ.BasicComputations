 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer Largest = integers[0];
        for(int i = 1; i < integers.length; i++)
            if (integers[i] > Largest)
                Largest = integers[i];
        return Largest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        return Math.max(integers[0],Math.max(integers[1],integers[2]));
    }
}
