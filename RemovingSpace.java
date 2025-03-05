import java.util.Scanner;
class RemovingSpace{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	
	// remove leading and trailing spaces
	System.out.println(s1.trim());
	}
}

