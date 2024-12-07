package study;

public class conditionalStatement {
	 
    public static void main(String[] args) {
         
        String id = "hsj";
        String inputId = args[0];
        String pw ="1234";
        String inputPw = args[1];
         
        System.out.println("Hi.");
         
        //if(inputId == id) {
        if(inputId.equals(id)&&inputPw.equals(pw)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}