import java.util.*;
class oddoreven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if (num%2==0)
        System.out.println("The given number is EVEN");
        else
        System.out.println("The given number is ODD");
    }
}
