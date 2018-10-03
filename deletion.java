class deletion { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d1) { 
            data = d1; 
            next = null; 
        } 
    } 
    void remove_duplicates() 
   { 
        Node obj1 = null, obj2 = null, dup = null; 
        obj1 = head; 
        while (obj1 != null && obj1.next != null) 
        { 
            obj2 = obj1; 
            while (obj2.next != null) 
            { 
                if (obj1.data == obj2.next.data) 
                { 
                    dup = obj2.next; 
                    obj2.next = obj2.next.next; 
                    System.gc(); 
                } 
                else  
                { 
                    obj2 = obj2.next; 
                } 
            } 
            obj1 = obj1.next; 
        } 
    } 
  
    void printList(Node node) { 
        while (node != null) { 
            System.out.println(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        deletion l1 = new deletion(); 
        l1.head = new Node(10); 
        l1.head.next = new Node(12); 
        l1.head.next.next = new Node(11); 
        l1.head.next.next.next = new Node(11); 
        l1.head.next.next.next.next = new Node(12); 
        l1.head.next.next.next.next.next = new Node(11); 
        l1.head.next.next.next.next.next.next = new Node(10); 
  
        System.out.println("Linked List before removing duplicates : \n "); 
        l1.printList(head); 
  
        l1.remove_duplicates(); 
        System.out.println(""); 
        System.out.println("Linked List after removing duplicates : \n "); 
        l1.printList(head); 
    } 
} 