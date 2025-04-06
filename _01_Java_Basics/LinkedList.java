package _01_Java_Basics;

public class LinkedList {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode != null) {
                currentNode = currentNode.next;
            }
            currentNode = newNode;
        }
    }

    public void delete(int data) { 
        if(head == null) return;

        if(head.data == data) {
            head = head.next;
        }

        Node currentNode = head;

        while(currentNode.next != null) {
            if(currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    public void display() {
        Node currentNode = head;
        while(currentNode.next != null) {
         System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void findMiddle(){
        if(head == null) {
            System.out.println("The list is empthy!");
            return;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle is: " + slow.data);
    }



    public boolean hasCycle() {
        //
        //return true;
        if (head == null || head.next == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
                //System.out.println("Has cycle is: " + slow.next);
        System.out.println("Has cycle is: " + fast.next.next);
        return false;

    }

    public void createCycle() {
        if(head == null) {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = head.next;
        }

    }
    // public static void main(String[] args) {
    //     System.out.println("Test");
    // }

    public void reverseLinkedList() {
        Node prev = null;
        Node currentNode = head;

        while(currentNode != null) {
            display();
            Node nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
        head = prev;
    }

    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        // l.add(10);
        // l.delete(10);
        l.createCycle();
        l.display();
        l.findMiddle();
        l.hasCycle();

        l.reverseLinkedList();
        l.display();
    }
}
