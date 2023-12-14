public class RBTree 
{
    private Node root;

    public class Node
    {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
    }

    private enum Color
    {
        RED, BLACK
    }

    private boolean addNode(Node node, int value)
    {
        if (node.value == value)
        {
            return false;
        } else
        {
            if (node.value > value)
            {
                if (node.leftChild != null)
                {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else 
                {
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true;
                }
            } else
            {
                if (node.rightChild != null)
                {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else
                {
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    private void colorSwap(Node node) 
    {
        node.leftChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node leftSwap(Node node) 
    {
        Node leftChild = node.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

     private Node rightSwap(Node node) 
    {
        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node rebalance(Node node) 
    {
        Node result = node;
        boolean needsRebalance = true;
        do
        {
            if (result.rightChild != null && result.rightChild.color == Color.RED && 
            (result.leftChild == null || result.leftChild.color == Color.BLACK))
            {
            needsRebalance = true;
            result = rightSwap(result);
            }
        if (result.leftChild != null && result.leftChild.color == Color.RED && 
            (result.leftChild.leftChild == null || result.leftChild.leftChild.color == Color.RED))
            {
            needsRebalance = true;
            result = leftSwap(result);
            }
        if (result.leftChild != null && result.leftChild.color == Color.RED && 
            result.rightChild != null && result.rightChild.color == Color.RED)
            {
            needsRebalance = true;
            colorSwap(result);
            }
        } while (needsRebalance);
        
        return result;
    }

    public boolean add(int value) 
    {
        if (root != null)
        {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else
        {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }
}
