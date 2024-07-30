package Tutorial1;


import java.util.*;
class Student
{
	int s_no,age;
	String s_name;
	Student(int s_no,int age,String name)

	{
		this.s_no=s_no;
		this.age=age;
		this.s_name=name;
	}
	public String toString()
	
	{
		return ("s.no is "+s_no+" age is "+age+"  s_name is "+s_name);
	}
}


public class Saikumar279 {

	public static void main(String[] args) {
		
		boolean repeat =true;
		int s_no,age,ch;
		String name;
		ArrayList<Student> sd=new ArrayList<>();
		Scanner s=new Scanner (System.in);
		while(repeat)
		{
			System.out.println("1.add\n2.print\n3.exit");
			System.out.println("enter ur ch");
			ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("enter serial number\n");
				s_no=s.nextInt();
                System.out.println("enter Age\n");
				age=s.nextInt();
                System.out.println("enter Name\n");
				s.nextLine();

				name=s.nextLine();
				sd.add(new Student(s_no,age,name));
			}
			else if(ch==2)
			{
				System.out.println(sd);
			}
			else
			{
				repeat =false;
			}
			
		}
		s.close();
		
		

	}

}

