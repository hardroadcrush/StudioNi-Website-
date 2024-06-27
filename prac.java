write a program to print all Prime numbers in an array of 'n' elements using command line arguments

class PrNo
{
    public static void main (String[] args)
    {
        int size= args.length;
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=Integer.parseInt(args[i]);

        }
        for(int i=0;i<array.length;i++)
        {
            boolean isPrime= true;
            for(int j=2;j<array[i];j++)
            {
                if(array[i]%j==0)
                    {
                     isPrime=false;
                      break;
                    }
            }
            if(isPrime)
            System.out.println(array[i]+" are the prime numbers in the array")
        }
    }
}

//Define an abstract class Staff with protected members id and name
Define a parametrized constructor. Define one subclass OfficeStaff with member department
Create n objects of OfficeStaff and display all details

import java.util.*;

abstract class Staff{
    protected int id;
    protected String name;
    public Staff(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class OfficeStaff extends Staff{
String dept;
OfficeStaff(int id, String name, String dept)
{
super(id,name);
this.dept=dept;

}
public static void main(String args[])
{
int n,id;
String name,dept;
Scanner sc=new Scanner(System.in);
System.out.println("How many staff members?");
n=sc.nextInt();
OfficeStaff ob[]=new OfficeStaff[n];
System.out.println("Enter details of "+n+"staff");
for(int i=0;i<n;i++)
{
System.out.println("Enter id, name, dept");
id-sc.nextInt();
name=sc.next();
dept=sc.next();
ob[i]=new OfficeStaff(id,name,dept);


}
System.out.println("Entered details are \n");
for(int i=0;i<n;i++)
{
    ob[i].display();
}
}

}


Write a program to read the First name and Last Name of a person, his weight
//and height using command line arguments. Calculate the BMI index which is defined 
 as the individuals body mass divided by the square of their height

 class BMI{
    public static void main(String args[]){
        String fname= args[0];
        String lname=args[1];
        double weight= Double.parseDouble(args[2]);
        double weight= Double.parseDouble(args[3]);
        double BMI= weight/(height*height);
        System.out.println("First name is"+fname);
        System.out.println("Last name is"+lname);
        System.out.println("weight is"+weight);
        System.out.println("Height is"+height);
        System.out.println("The Body Mass Index (BMI) is"+BMI+"kg/m^2");
    
    }
 }

 Define a class CricketPlayer (name,no_of_innings,no_of_times_notout,totalrunss,)
bat_avg).Create an array of n player objects. Calvulate the vatting average for each player 
using static method avg(). Define a static sort method which sorts the array on the basis of average
