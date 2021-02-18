package manau;

public class Pattern {
public static void pnum(int size) {
	System.out.println(1);
	for (int i=2;i<=size;i++) {
		if(i%2!=0) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.println();
		}else System.out.println(i);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pnum(10);
	}

}
