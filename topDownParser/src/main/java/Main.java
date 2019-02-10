import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите любое объявление переменных в Pascal");
        String input = in.nextLine();
        try {
            Parser parser = new Parser();
            Tree curTree = parser.parse(input);
            TreeVisualizer treeVisualizer = new TreeVisualizer();
            treeVisualizer.printToFile(input, curTree);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}
