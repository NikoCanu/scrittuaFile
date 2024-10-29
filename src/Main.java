import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScriviFile file = new ScriviFile("file.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi il testo da inserire nel file:");
        boolean write;
        do {
            String s = scanner.nextLine();
            write = file.write(s);
        } while (write);

    }
}