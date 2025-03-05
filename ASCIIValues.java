import java.util.Scanner;
class ASCIIValues{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	//type casting to int to  get the ascii value of alphabet entered
	int x = (int)s1.charAt(0);
	System.out.println(x);
	}
}
