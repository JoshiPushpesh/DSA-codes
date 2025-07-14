import java.util.*;

    class Node{
        int data;
        Node next;
    }
public class SinglyLinkedList {

    Node START;

    SinglyLinkedList(){
        START  = null;
    }

    void insert(){
        System.out.println("enter data");
        Scanner sc2 = new Scanner(System.in);
        int info = sc2.nextInt();
        Node nn = new Node();
        nn.data = info;
        nn.next = null;

        if(START == null){  // if list not exist means making a new list
            START = nn;
        }
        else{  // if list already exist 
            Node current = START;
            while(current.next!=null){
                current = current.next;
            }
            current.next = nn;
        }
        System.out.println("data inserted...");
    }

    void delete(){
        if(START == null){
            System.out.println("list empty");
        }
        else{
            System.out.println("deleted element " + START.data);
            START = START.next;
        }
    }

    void search(){
        if(START == null){
            System.out.println("list empty ..!");
        }
        else{
            System.out.println("enter searching element");
            Scanner sc3 = new Scanner(System.in);
            int see = sc3.nextInt();

            Node current;
            int count = 0;
            for(current = START; current != null; current = current.next){
                if(current.data == see){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println("found ");
            }
            else{
                System.out.println("not found ");
            }
        }
    }

    void traverse(){
        if(START == null){
            System.out.println("linked list empty ");
        }else{
            System.out.println("Records...! ");

            Node current;
            for(current = START;current !=null; current = current.next){
                System.out.println(" " + current.data);
            }
        }
    }
    void deleteAtLast(){
        if(START == null){
            System.out.println("list empty..!");
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
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for search");
            System.out.println("Press 4 for traverse");
            System.out.println("Press 5 for exit");
            System.out.println("Press 6 for delete at last");

            System.out.println("enter your choice");
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

                default:
                System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
