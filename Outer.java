package staticexample;

public class Outer {
	private static float value = 234.567f;
	public static void displayValue(){
		System.out.println(value);
		
	}
	public static class Inner{
		public void callPrivateMethodOfOuterClass() {
			displayValue();
		}
	}
}
