//Scenario= you are an IT support administrator specialist and are charged with the task of creating new
//email account for new hires.

//application should contain:
//	1.Generate a email with the following syntax=firstname.lastname@department.company.com
//	2.Determine the department(Sales,accounting),if none leave blank
//	3.Generate a random string for Password
//	4.Have a Set method to change password,set the mailbox capacity,and define a alternate emailaddress
//	5.Have get method to display name ,email,mailbox capacity
package emailapp;

import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
     Email em1=new Email();
// em1.setAlternateEmail("r.r@gmail.com");
// System.out.println(em1.getAlternateEmail());
	  System.out.println( em1.showInfo());
	 // Email em2=new Email();
 
}
}