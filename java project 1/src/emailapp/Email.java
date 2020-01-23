package emailapp;

import java.util.Scanner;

public class Email {
 private String firstname;
 private String lastname;
 private String password;
 private String department;
 private String email;
 private int mailboxCapacity =500;
 private int defaultpasswordLength =10 ;
 private String alternateEmail;
 private String companySuffix="ritika.com";
 
//constructor to receive first and last name
 public Email()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.print("Enter your Firstname:");
	 this.firstname= in.nextLine();
	 System.out.print("Enter your Lastname:");
	 this.lastname=in.nextLine();
	 //System.out.println("Email Created:"+ this.firstname+" "+this.lastname);
	 
	 //call a method asking for the department-return the department
	 this.department=SetDepartment();
	 //System.out.println("Department:"+this.department);
	 
	 //call a method to return a random password
	 this.password=randomPassword(defaultpasswordLength);
	 //System.out.println("your password is:"+ this.password);
	 //combine elements to generate email
	 email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
	// System.out.println("your email is:"+email);
 }
    
 
 //Ask for the department
 private String SetDepartment()
 {
	 System.out.println("New Worker:"+firstname+".DEPARTMENT CODES\n1 for Sales \n2 for Development\n3 for accounting\n0 for none \n Enter the Deparment codes:");
	 Scanner in=new Scanner(System.in);
	 int depChoice=in.nextInt();
	 if (depChoice ==1 )
	 {
		 return "sales";
	 }
	 else if(depChoice ==2)
	 {
		 return "Development";
	 }
	 else if(depChoice ==3)
	 {
		 return " Accounting";
	 }
	 else
	 {
		 return " ";
		 
	 }
 }
 //Generate the random password
 private String randomPassword(int length)
 {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	char[] password =new char[length];
	for (int i=0;i<length;i++) {
		int rand= (int)(Math.random() *passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}
	return new String(password);	
 }
 //set the mailbox capacity
 public void setMailboxCapacity(int capacity)
 {
	 this.mailboxCapacity=capacity;
 }
 
 //set the alternate email
 public void setAlternateEmail(String altEmail)
 {
	 this.alternateEmail=altEmail;
 }
 // change the password
 public void changePassword(String password)
 {
	 this.password=password;
 }
 public int getMailboxCapacity()
 {
	 return mailboxCapacity;
 }
 public String getAlternateEmail()
 {
	 return alternateEmail;
 }
 public String getPassword()
 {
	 return password;
 }
 public String showInfo()
 {
	 return "Display name:" +firstname+" "+lastname+"\n"+"Company Email:"+email +"\nMailbox Capacity:"+mailboxCapacity
			 +"mb";
 }
}
