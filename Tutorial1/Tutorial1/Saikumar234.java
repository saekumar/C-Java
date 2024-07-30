package Tutorial1;

import java.util.*;

 class Student1
{
    int s_no;
    int age;
    String s_name;
    Student1(int no,int age,String name)
    {
        this.s_no=no;
        this.age=age;
        this.s_name=name;

    }
    public String toString()
    {
        return ("Serial Number "+s_no+" Name "+s_name+" Age "+age);
    }

}

public class Saikumar234 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s_no,ch;
        int age;
        String s_name;
        ArrayList<Student1> ar=new ArrayList<>();
        boolean re=true;
        while(re)
        {
            System.out.println("Please select from the list \n1.Add \n2.print\n3.Exit ");
            System.out.println("Enter Your Choice ");
             ch=sc.nextInt();
            sc.nextLine();
            if(ch==1)
            {
            System.out.println("Enter Serial Number ");
            s_no=sc.nextInt();
            System.out.println("Enter Age ");
            age=sc.nextInt();
            System.out.println("Enter Studenet Name ");
            sc.nextLine();
            s_name=sc.nextLine();
            ar.add(new Student1(s_no, age, s_name));
            }
            else if(ch== 3)
            {
                for (Student1 student1 : ar) {
                    System.out.println(student1);
                    
                }
            }
            else if(ch==4)
            {
                re=false;
            }

        }
        sc.close();
    }
    
}
