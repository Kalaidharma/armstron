import java.util.Scanner;
public class armstrong {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,b,c;
		double sum=0;
		n=sc.nextInt();
		b=Integer.toString(n).length();
		int temp=n;
		while(temp!=0){
			c=temp%10;
			sum= (sum+Math.pow(c,b));
			temp=temp/10;
			
		}
		System.out.println(sum);
		if(n==sum){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
	}
}

