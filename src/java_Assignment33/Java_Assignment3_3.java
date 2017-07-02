package java_Assignment33;
/*
 * This class will help you to master OOPS and super and this keyword.
 * Problem Statement
 * Create a program to demonstrate Constructor Chaining. Between the same class and between the child and parent class.
 */

public class Java_Assignment3_3 
{

	public static void main(String[] args)
	{
		System.out.println("Same Class Constructor chaining:\n");
		ConsChainSameClass objSameClass=new ConsChainSameClass("Hello",10,20);
        
		System.out.println("\nChild Class Constructor chaining with default constructor\n");
		Derive objDrvNoArg=new Derive();
		
		System.out.println("\nChild Class Constructor chaining with a single parameter\n");
		Derive objDrvOneArg=new Derive("Hello");
		
		System.out.println("\nChild Class Constructor chaining with a double parameter\n");
        Derive objDrvTwoArg=new Derive("Hello",30);

	}

}

//Same Class Constructor chaining
class ConsChainSameClass
{
    public ConsChainSameClass()
    {
        System.out.println(" Default Constructor");
    }
     public ConsChainSameClass(String str)
    {
        this();
        System.out.println(" Constructor with Single Parameter: "+str);
    }
     public ConsChainSameClass(String str,int num)
    {
        this(str);
        System.out.println(" Constructor with Double Parameter: "+str+" "+num);
    }
      public ConsChainSameClass(String str,int num1,int num2)
    {
        this(str,num1);
        System.out.println(" Constructor with Double Parameter: "+str+" "+num1+" "+num2);
    }
}

class Base // Base Class
{
    //Declaration of variables
	String name;
    int num;
    
    // Base Class default constructor
    Base()
    {
       System.out.println(" Default Constructor of base class");        
    }
    
    // Base Class constructor with single argument
    Base(String s)
    {
       this.name=s; //Initializing the class member
       System.out.println(" Single argument Constructor of base class: "+this.name);       
        
    }
    
    // Base Class constructor with two arguments
    Base(String s,int n)
    {
       this(s); // Calling the constructor of this class with single argument 
       this.num=n; //Initializing the class member
       System.out.println(" Two argument Constructor of base class: "+this.name+ " "+this.num);      
        
    }
    
}
class Derive extends Base // Child Class
{
	// Child Class default constructor
    Derive()
    {
    	super(); //calling the base class constructor
        System.out.println(" Default Constructor of Derive Class: ");
        
    }
   // Child Class constructor with single argument
    Derive(String s)
    {
        super(s); //calling the base class constructor
        System.out.println(" Calling Parameter Constructor of Derive Class with One Argument: ");
        
    }
    // Child Class constructor with two arguments
    Derive(String s,int n)
    {
        super(s,n); //calling the base class constructor
        System.out.println(" Calling Parameter Constructor of Derive Class with two Argument: ");
        
    }
}