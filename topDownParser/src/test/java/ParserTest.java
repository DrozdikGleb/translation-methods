import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class ParserTest {
    @Test
    public void multipleDeclarationTest() {
        String[] tests = {
                "var a,b : integer; c, d:boolean; f: string;",
                "var m, l : real; k: shortint;",
                "var lala4:boolean;",
                "var       vari:integer;",
                "var a: Boolean;",
                "var a:1..150;",
                "var a43:1..155; baba: 10..50;"
        };
        runCorrectTest(tests);
    }

    @Test(enabled = true)
    public void wrongDeclarationTest() throws Exception {
        String[] wrongTest = {
                "a, b",
                "var a,  b, integer;",
                "var caca"
        };
        runFailTest(wrongTest);
    }

    private void runFailTest(String[] input) throws Exception {
        for (int i = 0; i < input.length; i++) {
            String curString = input[i];
            try {
                Parser parser = new Parser();
                parser.parse(curString);
            } catch (AssertionError | ParseException e) {
                return;
            }
            throw new Exception("Expected fail in test: " + curString);
        }
    }


    private void runCorrectTest(String[] tests) {
        for (int i = 0; i < tests.length; i++) {
            String curString = tests[i];
            String testNumber = "test" + String.valueOf(i + 1) + "correct";
            Parser parser = new Parser();
            Tree curTree = null;
            try {
                curTree = parser.parse(curString);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                return;
            }
            visualize(curTree, testNumber);
        }
    }

    private void visualize(Tree curTree, String filename) {
        TreeVisualizer treeVisualizer = new TreeVisualizer();
        treeVisualizer.printToFile(filename, curTree);
        ProcessBuilder pb = new ProcessBuilder(System.getProperty("user.dir") + "/run.sh", filename);
        try {
            Process p = pb.start();
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
