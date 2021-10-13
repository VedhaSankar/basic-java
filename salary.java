import java.util.Scanner;
class Employee
{
	long mobno;
	String name,address,eid,mailid;
	Scanner get=new Scanner(System.in);
	Employee()
	{
		System.out.println("Enter Employee name:");
		name=get.nextLine();
		System.out.println("Enter Employee id:");
		eid=get.nextLine();
		System.out.println("Enter Employee address:");
		address=get.nextLine();
		System.out.println("Enter mailid:");
		mailid=get.nextLine();
		System.out.println("Enter Mobile number:");
		mobno=get.nextLong();
	}
	void display()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+eid);
		System.out.println("Employee address: "+address);	
		System.out.println("Employee mail id: "+mailid);
		System.out.println("Employee mobile: "+mobno);
	}
}
class programmer extends Employee
{
	double bp,rate,net;
	String des;
	programmer()
	{
		System.out.println("Enter the Basic Pay:");
		bp=get.nextDouble();
	}
	void pay_prog()
	{
		rate=bp+(0.97*bp)+(0.01*bp)+(0.12*bp)+(0.001*bp);
		net=rate-(0.12*bp);
	}
	void display()
	{
		System.out.println("PROGRAMMER DETAILS");
		super.display();
		System.out.println("Gross salary: "+rate);
		System.out.println("Net salary: "+net);
	}
}
class assistantprofessor extends Employee
{
	double bp1,rate1,net1;
	String des1;
	assistantprofessor()
	{
		System.out.println("Enter the Basic Pay:");
		bp1=get.nextDouble();
	}
	
	void pay_ap()
	{
		rate1=bp1+(0.97*bp1)+(0.01*bp1)+(0.12*bp1)+(0.001*bp1);
		net1=rate1-(0.12*bp1);
	}
	void display()
	{
		System.out.println("ASSISTANT PROFESSOR DETAILS");
		super.display();
		System.out.println("Gross salary: "+rate1);
		System.out.println("Net salary: "+net1);
	}
}
class associateprofessor extends Employee
{
	double bp2,rate2,net2;
	String des;
	associateprofessor()
	{
		System.out.println("Enter the Basic Pay:");
		bp2=get.nextDouble();
	}
	void pay_asp()
	{
		rate2=bp2+(0.97*bp2)+(0.01*bp2)+(0.12*bp2)+(0.01*bp2);
		net2=rate2-(0.12*bp2);
	}
	void display()
	{
		System.out.println("ASSOCIATE PROFESSOR DETAILS");
		super.display();
		System.out.println("Gross salary: "+rate2);
		System.out.println("Net salary: "+net2);
	}
}
class professor extends Employee
{
	double bp3,rate3,net3;
	String des;
	 professor()
	{
		System.out.println("Enter the Basic Pay:");
		bp3=get.nextDouble();
	}
	void pay_p()
	{
		rate3=bp3+(0.97*bp3)+(0.01*bp3)+(0.12*bp3)+(0.01*bp3);
		net3=rate3-(0.12*bp3);
	}
	void display()
	{
		System.out.println("PROFESSOR DETAILS");
		super.display();
		System.out.println("Gross salary: "+rate3);
		System.out.println("Net salary: "+net3);
	}
}
class salary
{
	public static void main(String args[])
	{
		System.out.println("ENTER PROGRAMMER DETAILS");
		programmer ob1=new programmer();
		ob1.pay_prog();
		ob1.display();
		
		System.out.println("ENTER ASSISTANT PROFESSOR DETAILS");
		assistantprofessor ob2=new assistantprofessor();
		ob2.pay_ap();
		ob2.display();
	
		System.out.println("ENTER ASSOCIATE PROFESSOR DETAILS");
		associateprofessor ob3=new associateprofessor();
		ob3.pay_asp();
		ob3.display();

		System.out.println("ENTER PROFESSOR DETAILS");
		professor ob4=new  professor();
		ob4.pay_p();
		ob4.display();
	}
}
