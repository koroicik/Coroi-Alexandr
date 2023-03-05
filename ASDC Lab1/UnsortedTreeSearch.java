import java.util.LinkedList;
import java.util.Queue;

public class UnsortedTreeSearch {
   public static int search(Node root, String key) {
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);

      while (!queue.isEmpty()) {
         Node node = queue.remove();
         if (node.data.equals(key)) {
            return node.id;
         }
         for (Node child : node.children) {
            queue.add(child);
         }
      }
      return -1;
   }
}

class Node {
   String data;
   int id;
   List<Node> children;

   public Node(String data, int id) {
      this.data = data;
      this.id = id;
      this.children = new ArrayList<>();
   }

   public void addChild(Node node) {
      children.add(node);
   }
}
