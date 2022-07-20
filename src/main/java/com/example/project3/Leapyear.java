class Leapyear
{
    static boolean leapyear(int yr)
    {
        if((yr % 400 == 0)||((yr%100!=0)&&(yr%4==0)))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int year=2016;
        boolean n;
        n=leapyear(year);
        if(n==true)
            System.out.println("Leap year");
        else
            System.out.println("Not a Leap year");
    }
}
