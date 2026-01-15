package CollectionFrameWorks.Lists.LinkedLists;

class Node{
    public int value;
    public Node next;
}

public class CustomLL_eg {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 10;
        node2.value = 20;
        node1.next = node2;
        node2.next = null;

        // printing the Linked list...
        Node temp = new Node();
        temp = node1;
        while(temp != null){
        System.out.println(temp.value);
        temp = temp.next;
        }
    }
}


