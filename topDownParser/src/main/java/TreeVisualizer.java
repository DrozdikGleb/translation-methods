import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TreeVisualizer {
    PrintWriter printWriter;
    int k = 0;

    public void printToFile(String name, Tree root) {
        try {
            printWriter = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/" + name + ".dot");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }
        printWriter.write("digraph Tree {\n");
        printTree(root);
        printWriter.write("}");
        printWriter.close();
    }

    public String printTree(Tree root) {
        if (root.children.size() > 0) {
            root.id = k++;
            printWriter.write(String.valueOf(root.id) + " [label=\"" + root.node + "\"" + "];\n");
            StringBuilder ids = new StringBuilder();
            for (int i = 0; i < root.children.size(); i++) {
                if (i != root.children.size() - 1) {
                    ids.append(printTree(root.children.get(i))).append(",");
                } else {
                    ids.append(printTree(root.children.get(i)));
                }
            }
            printWriter.write(String.valueOf(root.id) + " -> {" + ids.toString() + "};\n");

            return String.valueOf(root.id);
        } else {
            root.id = k++;
            printWriter.write(String.valueOf(root.id) + " [label=\"" + root.node + "\"" + "];\n");
            return String.valueOf(root.id);
        }
    }
}
