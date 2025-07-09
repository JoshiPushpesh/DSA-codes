import java.util.*;

class Node{
    int data;
    Node next;
    Node previous;
}
public class DoublyLinkedList {
    Node START;
    DoublyLinkedList(){
        START = null;

    }
    void insert(){
        System.out.println("enter any data");
        Scanner sc2 = new Scanner(System.in);
        int info = sc2.nextInt();
        
        Node nn = new Node();
        nn.data = info;
        nn.next = null;
        nn.previous = null;

        if(START == null){
            START = nn;
        }
        else{
            Node current = START;
            while(current.next!=null){
                current = current.next;
            }
            current.next = nn;
            nn.previous = current ;
        }
        System.out.println("data inserted...! ");
    }
    void delete(){
        if(START == null){
            System.out.println("doubly list empty");
        }else if(START.next == null){  // if list having a singly element
            System.out.println("deleted element : " + START.data);
            START = null ;
        }
        else{ // if list having more than one element 
            System.out.println("deleted element : " + START.data);
            START = START.next;
            START.previous = null;
        }
    }
    void search(){
        if(START == null){
            System.out.println("list empty");
        }else{
            System.out.println("enter seraching element");
            Scanner sc3 = new Scanner(System.in);
            int see = sc3.nextInt();

            Node current;
            int count = 0;
            for(current = START;current!=null;current = current.next){
                if(current.data == see){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
        }
    }
    void traverse(){
        if(START == null){
            System.out.println("doubly list empty");
        }
        else{
            System.out.println("...forword traverse...");
            Node current;
            Node end = null;
            for(current = START;current!=null;current=current.next){
                end = current;
                System.out.println(" " + current.data);
            }

            System.out.println("...reverse traverse...");

            Node currentrev;
            for(currentrev = end ; currentrev!=null;currentrev = currentrev.previous){
                System.out.println(" " + currentrev.data);
            }
        }
    }
    void deleteAtLast(){
        if(START == null){
            System.out.println("empty list");
        }
        else{
             Node current = START;
            while (current.next.next!=null) {
                current = current.next;
            }
            System.out.println("last element deleted "+current.next.data);
            current.next=null;
        }
    }

    void swap(){
        if(START == null){
            System.out.println("list empty..!");
        }
        else{
            // Node first = START;
            Node end = START;

            while(end.next!=null){
                end = end.next;
            }
            int temp = START.data;
            START.data = end.data;
            end.data = temp;

            System.out.println("swapped...!");
        }
    }

    void evenOdd(){
        if(START == null){
            System.out.println("list empty");
        }else{
            Node current ;
            Node end = null;
            for(current = START;current!=null;current=current.next){
                if(current.data%2==0){
                    System.out.println(" "+current.data);
                }else{
                    System.out.println(" "+current.data);
                }
            }
        }
    }

    void highest(){
        if(START == null){
         System.out.println("list is empty...");   
        }
        else{
            Node current = START.next;
            while(current!=null){
                if(current.data>START.data){
                START.data = current.data;
            }
            current = current.next;
        }
        System.out.println("higest element is :-> "+ START.data);
    }
    }
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        while(true){
            System.out.println("press 1 for insert ");
            System.out.println("press 2 for delete ");
            System.out.println("press 3 for search ");
            System.out.println("press 4 for traverse ");
            System.out.println("press 5 for exit ");
            System.out.println("press 6 for delete at last ");            
            System.out.println("press 7 for swap first and last ");            
            System.out.println("press 8 for even odd series ");            
            System.out.println("press 9 for highest element on list ");            


            System.out.println("enter your choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.insert();
                    break;
            
                case 2:
                    obj.delete();
                    break;
            
                case 3:
                    obj.search();
                    break;
            
                case 4:
                    obj.traverse();
                    break;
            
                case 5:
                    System.exit(0);
                    break;

                case 6:
                    obj.deleteAtLast();
                    break;    
                
                case 7:
                    obj.swap();
                    break;

                case 8:
                    obj.evenOdd();
                    break;

                case 9:
                    obj.highest();
                    break;

                default:
                System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
