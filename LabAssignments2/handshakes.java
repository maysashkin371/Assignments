import java.util.*;
import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)

	{
Scanner sc = new Scanner (System.in);
int n = 0;
//reads the input from user and stores into n variable
System.out.print ("Enter N Input:");
n = sc.nextInt ();
//formula for calculating HANDSHAKE problem
n = n * (n-1) / 2;
System.out.println ("Maximum Number Of HAndSHake;"+n);
	}
}