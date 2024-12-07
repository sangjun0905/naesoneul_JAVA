package study;

public class AuthApp {

	public static void main(String[] args) {
		//String[] users = {"hsj", "aaa", "bbb"};
		//                     00      01       10      11       20     21
		String [][] users = {{"hsj", "1111"}, {"aaa", "2222"}, {"bbb","3333"}};
		String inputId = args[0];
		String inputPw = args[1];
		
		boolean isLogined = false;
		
		for(int i=0;i<users.length;i++) {
			if(inputId.equals(users[i][0])&&inputPw.equals(users[i][1])) {
				isLogined = true;
				break;
			}
		}
		if(isLogined) {
			System.out.println("Hello user");
		} else {
			System.out.println("who are you!!");
		}
	}

}
