import java.util.*;
class Node {
    Node next;
    int data;

    public Node(int val) 
    {
        data = val;
    }
}

public class palindrome {

        static Node rev(Node head) {

            Node prev = null;
            Node curr = head;
            Node next;
            while (curr != null) 
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            return head;
        }

        static public boolean pal(Node head) {

            Node curr = head;
            int len = 0;
            while (curr != null) {
                curr = curr.next;
                len++;
            }
            int mid = len % 2 == 0 ? len / 2 + 1 : len / 2 + 2;
            int index = mid;
            curr = head;
            while (index > 1) {
                curr = curr.next;
                index--;
            }
            Node head1 = rev(curr);

            boolean pal = true;
            index = len / 2;
            curr = head;
            while (index > 0) {

                if (curr.data != head1.data) {
                    pal = false;
                    break;
                }
                curr = curr.next;
                head1 = head1.next;
                index--;
            }

            return pal;
        }

        public static void main(String[] args) {

            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);

            System.out.println(pal(head));
        }
    }