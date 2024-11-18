package TryCatch;

public class NestedEx {

	public static void main(String[] args) {
		
		try {
			System.out.println("sysout out is print");
			try {
				System.out.println("inner try is print");
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			};
			String name = null;
			System.out.println(name.toUpperCase());
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
