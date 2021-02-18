package manau;

public class Fib {
	public  static void  fib(int size ) {
		int a=0,b=1,c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i=1;i<=size;i++) {
			c=a+b;
			a=b;b=c;
			System.out.print(c+" ");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fib(15);
	}

}
