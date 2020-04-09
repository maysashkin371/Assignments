import java.util.Scanner;

public class PascalsTriangleJava 
{
   static int findFactorial(int number)
   {
      int factorial;
      for(factorial = 1; number > 1; number--)
      {
         factorial *= number;
      }
      return factorial;
   }

   // here's the function to display pascal's triangle
   static int printPascalTraingle(int num, int p) 
   {
      return findFactorial(num) / ( findFactorial(num - p) * findFactorial(p));
   }

   public static void main(String[] args) 
   {
      int row, a, b;
      System.out.println("Please enter number of rows: ");
      Scanner sc = new Scanner(System.in);
      row = sc.nextInt();
      System.out.println("Here's is pascal's triangle: ");
      for(a = 0; a < row; a++) 
      {
         for(b = 0; b < row - a; b++)
         {
            System.out.print(" ");
         }
         for(b = 0; b <= a; b++)
         {
            System.out.print(" " + printPascalTraingle(a, b));
         }
         System.out.println();
      }
      sc.close();
   }
}
