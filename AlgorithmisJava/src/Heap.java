class Node{
    public String data;
    public Node next;

    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class Heap {

    private static Node head;
    private static Node tail;

    public static Node init(){
        //o primeiro nó chamado cabeça nó
        head = new Node("A", null);
        Node nodeB = new Node("B", null);
        head.next = nodeB;

        Node nodeC = new Node("C", null);
        nodeC.next = nodeC;

        //o último nó chamado nó de cauda
        tail = new Node("D", null);
        nodeC.next = tail;

        return head;
    }
    public static void main(String[] args) {

    }
}
