package MethodPackage;


class Greeting{
	// public, protected, default, private
		public static void hi() {
			System.out.println("Hi~");
		}
}

/* public : 다른 클래스에서 사용 가능. 우선은 public만 사용해도 괜춘
 * private : 해당 클래스 내에서만 실행 가능
 */


public class AccessLevelModifiersMethod {
	

	public static void main(String[] args) {
		Greeting.hi();

	}
	
}
