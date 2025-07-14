public class LinerSearch {
   static boolean search(int [] arr, int i , int key){
    if(i==arr.length)
        return false;
    
    if(arr[i]==key)
        return true;
        return search(arr, i+1, key);
   }
    public static void main(String[] args) {
        // int[] arr = {4,2,5,1};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("eneter element");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter seacrhing element");
        int key = sc.nextInt();
        System.out.println(search(arr, 0, 3));

    }
}
