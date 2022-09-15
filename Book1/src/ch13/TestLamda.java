package ch13;

interface PrintString {
	void showString(String str);
}
public class TestLamda {

	public static void main(String[] args) {
		
		PrintString lamdaStr = s -> System.out.println(s);
		lamdaStr.showString("hello lamda1");
		showMyString(lamdaStr);
		PrintString reStr = returnString();
		reStr.showString("hello ");
	} 
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s+"world");
	}
}
