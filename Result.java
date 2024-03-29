package studpack;
interface Sports
{
	int grade = 100;
	void displayGrade();
}

class Student
{
	String name;
	int rollno;
	float mark1, mark2, mark3;
	
	Student()
	{
		name="NONE";
		rollno= 0;
		mark1=mark2=mark3=0;
	}
	
	Student(String name, int rollno, float mark1, float mark2, float mark3)
	{
		this.name=name;
		this.rollno=rollno;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
}

public class Result extends Student implements Sports
{
	float total;
	
	public void displayGrade()
	{
		System.out.println("Sports Grade =" + grade);
	}
	
	public void displayTotal()
	{
		System.out.println("Roll No=" + rollno);
		displayGrade();
		System.out.println("Total obtained=" +total+"/400\n");
	}
	
	public Result()
	{
		super();
		total=0;
	}
	
	public Result(String name, int rollno, float mark1, float mark2, float mark3)
	{
		super(name, rollno, mark1, mark2, mark3);
		total =mark1 + mark2 + mark3 + grade;
	}
}
