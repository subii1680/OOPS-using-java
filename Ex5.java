import java.util.*;
interface Calculator
{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class Operation implements Calculator
{
   public int add(int a,int b)
   {
       return a+b;
   }
   public int sub(int a,int b)
   {
       return a-b;
   }
   public int mul(int a,int b)
   {
       return a*b;
   }
   public int div(int a,int b)
   {
       return a/b;
   }
}
class Ex5
{
   public static void main(String arg[])
   {
      Ex5 obj=new Ex5();
      Operation o=new Operation();      
      Scanner s=new Scanner(System.in);
      while (true)
      {
         System.out.println("---SIMPLE CALCULATOR---");
         System.out.println("1.Addition");
         System.out.println("2.Substraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("5.Exit");
         System.out.println("Enter your choice:");
         int ch=s.nextInt();
         if(ch==1)
         {
            System.out.println("Enter a and b:");
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Addition of two numbers:"+o.add(a,b));
         }
         else if(ch==2)
        {
            System.out.println("Enter a and b:");
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Substraction of two numbers:"+o.sub(a,b));
        }
         else if(ch==3)
        {
            System.out.println("Enter a and b:");
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Multiplication of two numbers:"+ o.mul(a,b));
        }
        else if(ch==4)
        {
            System.out.println("Enter a and b:");
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Division of two numbers:"+o.div(a,b));
        }
        else if(ch==5)
        {
        System.out.println("Program ended");
        return;
        }
        else
        {
             System.out.println("Invalid choice");
        }
      }
   }
}
