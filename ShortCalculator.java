 


public class ShortCalculator 
{
    private short s1;
    private short s2;
    public void setTwoShort (short newS1, short newS2)
    {
        s1 = newS1;
        s2 = newS2;
    }
    
    public short[] getTwoShort()
    {
        short[] twoShort = {s1,s2};
        return twoShort;
    }
    
    // Is it even possible to do short addition without converting to int?
    // addition operator like below will automaticaliy convert short to int
    public short unsignedSum()
    {
        return (short) (s1+s2);
    }
    
    public short unsignedDiff()
    {
        return (short) (s1-s2);
    }
}
