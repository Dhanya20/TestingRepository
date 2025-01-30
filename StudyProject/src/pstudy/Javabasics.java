package pstudy;

public class Javabasics {

	public static void main(String[] args)
	{
    int a=10;
    char b=10;
    String letter="Dany";
    double p=0.99;
    boolean f=true;
    
    System.out.println(letter + a+b+p+f);
     
    int [] arr= {1,2,3,4,5};
    for(int i=0; i<arr.length;i++)
    {
    	System.out.println(arr[i]);
    }
    
 String name[]= {"Dhanya","Sanjay","Nari"};
 
	for(String s:name)
	{
		System.out.println(s);
	}
}
}
