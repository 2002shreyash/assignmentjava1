/*
  Write a program that determines whether a student passes an exam based on three subjects.
  A student passes if the average score is at least 60, and none of the individual scores 
  is below 40.
  Requirements:
  Use logical operators && and || to combine conditions.
 */

package Assignment_26;

public class Assign_2Main {

	public static void main(String[] args)
	{
		Assign_2 student = new Assign_2();
		
		student.accept();
		student.display();
		student.check();

	}

}
