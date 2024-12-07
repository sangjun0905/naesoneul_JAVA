package study;

public class LoopArray {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "hsj";
		users[1] = "aaa";
		users[2] = "bbb";
		
		for(int i=0;i<users.length;i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}

	}

}
