import java.util.Scanner;
public class ReadingInput{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your Name: ");
    String name = scanner.nextLine();
    System.out.println("Your Name is " + name);
  }
}
