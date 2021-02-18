package manau;

public class Palin {
	public static void isPalin(String str) {
		StringBuffer reverse=new StringBuffer();
		StringBuffer str1=new StringBuffer(str);
		if(str1!=null) {
			 reverse= str1.reverse();
			System.out.println(str1);
			System.out.println(str);
		}
		if (str1.equals(reverse)) {
			System.out.println("Palindrom");
		}
		else System.out.println("Not Palindrom");
	}

	public static void main(String[] args) {
		String str="NITIN";
		isPalin(str);
		

	}

}
