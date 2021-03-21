package git;
import java.util.Scanner;

public class HelloGit {

	public static void main(String[] args) {
		System.out.println("Hello Git");
		
		Scanner username = new Scanner(System.in);
		System.out.println("What is your username?");
		String name = username.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("Welcome to She Codes!");

	}

}
