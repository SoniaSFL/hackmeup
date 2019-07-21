package app;

public class Main {
	
	public static void main(String[] args) {
		
		String[] stringArray1 = Tools.split("a,b,c",",");
		String[] stringArray2 = Tools.split("abcbd","bc");
		
		for (String string: stringArray1) {
			System.out.println(string);
		}
		
		for (String string: stringArray2) {
			System.out.println(string);
		}

	}
	
}
