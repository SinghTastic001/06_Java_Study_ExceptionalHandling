package TryCatch;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 5;
			System.out.println(a/b);
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch(Exception e) {
				System.out.println(e);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
