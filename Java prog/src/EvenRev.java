import java.util.Scanner;
class EvenRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number!!");
		int a=sc.nextInt();
		while(a>0)
		{
			if (a%2==0) 
			System.out.println(a);
			a--;
			
		}
	}

}
