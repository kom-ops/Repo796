import java.util.Scanner;
class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number!!");
		int a=sc.nextInt();
		double f=1;
		while(a>0)
		{
			f=f*a;
			a--;
		}
		System.out.println(f);
	}
}

