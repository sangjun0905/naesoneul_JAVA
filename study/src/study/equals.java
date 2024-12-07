package study;

public class equals {

	public static void main(String[] args) {

	}

}

/*제어문 
 * == vs equals 
 * 
 * int p1 = 1
 * int p2 = 1        -> String과 원시 데이터타입의 경우 같은 곳에 저장된 1을 가져옴
 * 
 * String s1 = new String("java")           String은 원시가 아니지만 같은 곳에 저장하는 특성이 있다. 이 특성을 없애기 위해 new 사용
 * String s2 = new String("java")        -> 원시 데이터 타입이 아닌 경우 다른곳에 저장 s1 != s2
 * 
 * 원시 데이터 타입: boolean, int, double, short, long, float, char
 * 원시 데이터 타입X: String, Array, Date, File ...... 
 * 
 * == 연산자는 같은 곳에 있는지를 확인하는 연산자
 * equals 문은 값, 내용이 같은지를 확인
 * 
 * *** 원시 데이터 타입이 아닌 경우 equals를 쓰자! (저장되는 위치가 다르므로 값만 확인을 위해서)
 * */
