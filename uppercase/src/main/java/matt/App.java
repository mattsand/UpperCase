package matt;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		String a;
		System.out.println("Geben sie einen Text ein!");
		a=scanner.next();
		System.out.println(a.toUpperCase());
	}
}
