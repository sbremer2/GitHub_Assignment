//Sara Bremer
package helloworld;

public class VarDataTypeAssignment 
{
	public static void main(String[] args) 
	{
		String nameA = "Bob ";
		String nameB = "Smith";
		byte age = 20;
		double gpa = 3.52;
		String major = "Biology";
		String classYear = "Sophomore";
		
		System.out.println("===============================");
		System.out.print("STUDENT REPORT\n");
		System.out.println("===============================");
		System.out.print("Student Name: \t" + nameA + nameB + "\n");
		System.out.print("Age: " + age);
		System.out.printf("\t\tGPA: %4.2f", gpa);
		System.out.printf("\nMajor: %s\n", major);
		System.out.printf("Class: %s\n", classYear);
		System.out.println("===============================");
	}
}
