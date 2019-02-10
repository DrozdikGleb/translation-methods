import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    String node;
    int id = -1;
    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        children = new ArrayList<>();
    }
}
