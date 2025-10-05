/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Stack<Node> stk = new Stack<>();
        Set<Node> visited = new HashSet<>();
        
        stk.push(node);
        visited.add(node);

        while(!stk.isEmpty()) {
            Node curr = stk.pop();
            map.put(curr, new Node(curr.val));

            for (Node neighbour : curr.neighbors) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    stk.push(neighbour);
                }
            }
        }

        for (Map.Entry<Node, Node> ent : map.entrySet()) {
            Node oldNode = ent.getKey();
            Node newNode = ent.getValue();
            for (Node neighbour : oldNode.neighbors) {
                newNode.neighbors.add(map.get(neighbour));
            }
        }

        return map.get(node);

        
    }
}
