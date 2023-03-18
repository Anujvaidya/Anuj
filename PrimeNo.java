import java.util.Scanner;
public class PrimeNo
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Numbere Here");
    int count=0;
    int n=sc.nextInt();

  for(int i=1; i<=n;i++)
  {
   if(n%i==0)
   {
     count++;
    }
  }
  if(count==2)
  {
    System.out.println("Prime Number:-" +" "+n);
  }
  else
  {
    System.out.println("Not a Prime Number:-"+ " "+n);
  }
  }
}	
    
