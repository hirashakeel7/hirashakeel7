// This program contains an error and will not compile.
class ThrowsDemoUsingThrows {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException();
		
	}
	public static void main(String args[]) {
		try{
			throwOne();
		}catch(IllegalAccessException e){
			System.out.print(e);
		}
	}
}