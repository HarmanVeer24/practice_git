import java.util.Scanner;
class RemoveInBetweenSpaces{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	// print out result after removing exesive spaces
        System.out.println(s1.replaceAll("  "," "));
	}
}
