 import java.util.Scanner;
public class userpassRTS {
		public static void main(String[]args){
			Scanner enterusername = new Scanner(System.in);
			Scanner enterpassword = new Scanner(System.in);
			String initialusername, initialpassword;
			System.out.print("Please enter Your user name");
			initialusername= enterusername.nextLine();
			System.out.print("Please enter Your password");
			initialpassword= enterpassword.nextLine();
			
			if (initialusername.equals("rts")&& initialpassword.equals("Merlin")){
				System.out.println("Welcome RTS");
			}	
			else{
				System.out.println("That is incorrect please try again");
			}
	}
}
