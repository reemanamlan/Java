import java.util.*;
class LinkedList2 { 
 
 static Node head; 
 
 static class Node { 
 
 char data; 
 Node next; 
 
 Node(char d) 
 { 
 data = d; 
 next = null; 
 } 
 } 
 
 Node reverse(Node node) 
 { 
 Node prev = null; 
 Node current = node; 
 Node next = null; 
 while (current != null) { 
 next = current.next; 
 current.next = prev; 
 prev = current; 
 current = next; 
 } 
 node = prev; 
 return node; 
 } 
 
 
 void printList(Node node) 
 { 
 while (node != null) { 
 System.out.print(node.data + " "); 
 node = node.next; 
 } 
 } 
 
 public static void main(String[] args) 
 { 
 LinkedList2 list = new LinkedList2(); 
 LinkedList2.head= new Node('A'); 
 LinkedList2.head.next = new Node('B'); 
 LinkedList2.head.next.next = new Node('C'); 
 LinkedList2.head.next.next.next = new Node('D'); 
 LinkedList2.head.next.next.next.next = new Node('E');
 LinkedList2.head.next.next.next.next.next = new Node('F');
 LinkedList2.head.next.next.next.next.next.next = new
Node('G');
 LinkedList2.head.next.next.next.next.next.next.next = new
Node('H');
 LinkedList2.head.next.next.next.next.next.next.next.next= 
new Node('I');
 
LinkedList2.head.next.next.next.next.next.next.next.next.next= new
Node('J');
 
 System.out.println("Given Linked list"); 
 list.printList(head); 
 head = list.reverse(head); 
 System.out.println(""); 
 System.out.println("Reversed linked list "); 
 list.printList(head); 
 
 } 
}