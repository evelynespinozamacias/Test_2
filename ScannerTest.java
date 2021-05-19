import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        String name; 
        name = in.nextLine();
        in.close();

        System.out.println(name);
    }
}
