package firstPackage;

public class FirstClass {
	
 static int a=44;

	public static void main(String[] args) {

		System.out.println("Hello !");
		System.out.println("Second commit from local mater ");
		System.out.println("Third commit from local master ");
		System.out.print(a+22);
		
		a=a*a;
		System.out.print(a);
		System.out.println("First commit from remote mater branch ");
		System.out.println("Second commit from remote mater branch ");
		System.out.println("Third commit from remote mater branch ");

		System.out.println("Here is a merge conflict I create from local master");

		System.out.println("Here is the conflict we have from remote master branch ");
		System.out.println("Here is Another conflict we have from remote master branch ");

	}

}
