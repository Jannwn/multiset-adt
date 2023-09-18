import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Tree {
    private Object root;
    private List<Tree> subtrees;

    public Tree(Object root) {
        this(root, null);
    }

    public Tree(Object root, List<Tree> subtrees) {
        this.root = root;
        if (subtrees == null) {
            this.subtrees = new ArrayList<>();
        } else {
            this.subtrees = new ArrayList<>(subtrees);
        }
    }

    public Object getRoot() {
        return root;
    }

    public List<Tree> getSubtrees() {
        return subtrees;
    }
}

