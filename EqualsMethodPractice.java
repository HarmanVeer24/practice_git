import java.util.Scanner;
class EqualsMethodPractice{
	public static void main(String[] args){ 
	Scanner sc = new Scanner(System.in); 
	String s1 = sc.next(); 
	String s2 = sc.next();
	// print the result via if-else block
	if(s1.equals(s2)){
		System.out.println("They are equal");
	  }
	else{
		System.out.println("They are not equal");
	  }
	}
}
