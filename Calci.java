package harshitha;
import java.util.*;
public class Calci
{
	public static void main(String[] args) {
		Label1:while("True"!=null) {
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
       
	    System.out.println("Enter your choice:");
     
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    Add add=new Add();
	    Subtract sub=new Subtract();
	    Multiply mul=new Multiply();
	    Division div=new Division();
        if(n==1) {
        	add.Add();
        }
        else if(n==2) {
        	sub.Subtract();
        }
        else if(n==3) {
        	mul.Multiply();
        }
        else if(n==4) {
        	div.Division();
        }
        else {
        	System.out.println("Invalid option!!!!");
        	continue Label1;
        }
        
    Label2:while("True"!=null) {    
	System.out.println("Do you want to continue \n for yes(enter Y or y)\n for no(enter N or n):"); 
    Scanner c=new Scanner(System.in);
    char d=c.next().charAt(0);
    
        if(d=='Y'||d=='y') {
        	continue Label1;
        }
        else if(d=='N'||d=='n'){
        	break Label1;
        }
        else if(d!='Y'&&d!='N'&&d!='y'&&d!='n') {
        	System.out.println("Wrong choice");
        	continue Label2;
        }
	}
		}
	}
}
class Add {
    void Add()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many numbers do you want to add:");

        int n=sc.nextInt();

        double arr[]=new double[n];

        System.out.println("Enter numbers:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();

        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Addition of given numbers is:"+sum);
    }
}
class Multiply{
    void Multiply(){
        
    System.out.println("Enter no.of operands:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    double a[]=new double[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++){
        a[i]=sc.nextDouble();
       
       
    }
    double mul=1;
    for(int j=0;j<n;j++){
        mul=mul*a[j];
    }
    System.out.println("multiplication of given numbers is:"+mul);
}}
class Division{
    void Division()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter first number:");
    double num1=sc.nextInt();
    System.out.println("enter second number:");
    double num2=sc.nextInt();
    double  d=num1/num2;
    System.out.println("Division of numbers is:"+d);
    }
}

class Subtract{
    void Subtract()
    {
         Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number:");
    double num1=sc.nextInt();
    System.out.println("Enter second number:");
    double num2=sc.nextInt();
    double  s=num1-num2;
    System.out.println("subtraction of numbers is:"+s);
    }
}
