import java.util.*;
public class ArmstrongNumbers
{

   public static void main(String[] args)
   {
       int num,rem,limit=1000;
       double sum = 0;
       Scanner in=new Scanner(System.in);
       System.out.print("Enter start point: ");
       int start=in.nextInt();
       limit=in.nextInt();
       System.out.print("Enter End point: ");
       for (int i = start; i <= limit; i++)
       {
           num = i;
           int length = String.valueOf(num).length();
           while (num > 0)
           {
               rem = num % 10;
               sum = sum + Math.pow(rem,length );
               num = num / 10;
           }
     
           if (sum == i && length>2)
           {
               System.out.print(i + " ");
           }
           sum = 0;
       }

   }

}