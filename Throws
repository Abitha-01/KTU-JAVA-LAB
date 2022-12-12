import java.util.Scanner;

public class Exceptionhand{
	public static void main(String[] args){
		
		opt op1=new opt(1,0);
		try{
			int s=op1.divide();
		}
		catch(myException e){
		  
		 System.out.println("error:"+e.getMessage());
		 
		
		
	}	
		
		finally{
			System.out.println("custom exception printed");
		}
	}
	
}
class opt{

	int a,b,s=0;
	opt(int x,int y){
		a=x;
		b=y;}
		
	int divide() throws myException{
		try{
			return a/s;
	
	
		}
		catch(ArithmeticException e)
	{
		throw new myException(); 
	}
	}
	
}
class myException extends Exception{
	myException(){
		super("nice kanna")	;
	}
}
