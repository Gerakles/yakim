public class NodeList implements MyList {

    Node root;

    @Override
    public Object get(int index) {
        int size = 0;
        Node temp = root;
        while (temp != null) {
            if (index == size) {
                return temp.getValue();
            }
            temp = temp.getNext();
            size++;
        }
        throw new ArrayIndexOutOfBoundsException( index );
    }

    @Override
    public Object add(String object) {
        if (root == null) {
            root= createNode(object);
        } else {
            Node temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            Node last= createNode(object);

            temp.setNext( last );
        }
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        Node temp = root;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        return size;

    }
    private Node createNode(String object) {
        Node node = new Node();
        node.setNext( null );
        node.setValue( object );
        return node;
    }
}

