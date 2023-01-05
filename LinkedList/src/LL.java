public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        System.out.print(temp.value + "->");
        for (int i = 1; i < size; i++) {
            temp = temp.next;
            System.out.print(temp.value + "->");

        }
        System.out.print("END");
    }



    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value  = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }


    }

}
