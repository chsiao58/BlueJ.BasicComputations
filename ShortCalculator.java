public class ShortCalculator 
{
    private short s1;
    private short s2;
    private final int VAL_TO_UNSIGNED_SHORT = 32768;
    public void setTwoShort (int newS1, int newS2)
    {
        if(newS1 >= 0 && newS1 <= 65535 && newS2 >= 0 && newS2 <= 65535 )
        {
            s1 = (short)(newS1-VAL_TO_UNSIGNED_SHORT);
            s2 = (short)(newS2-VAL_TO_UNSIGNED_SHORT);
        }
    }
    
    public int[] getTwoShort()
    {
        int[] twoShort = {s1+VAL_TO_UNSIGNED_SHORT,s2+VAL_TO_UNSIGNED_SHORT};
        return twoShort;
    }
    
    // Is it even possible to do without converting to int?
    // addition operator like below will automaticaliy convert short to int
    public short unsignedSum()
    {
        return (short)(s1+s2);
    }
    
    public short unsignedDiff()
    {
        return (short)(s1-s2);
    }
    
    public short unsignedProduct()
    {
        return (short)(s1*s2+VAL_TO_UNSIGNED_SHORT);
    }
    
    public short unsignedQuotient()
    {
        return (short)Math.abs(
        s1+VAL_TO_UNSIGNED_SHORT/s2+VAL_TO_UNSIGNED_SHORT);
    }
    
       public short unsignedRemainder()
    {
        return (short)(s1+VAL_TO_UNSIGNED_SHORT%s2+VAL_TO_UNSIGNED_SHORT);
    }
}
