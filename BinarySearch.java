public class BinarySearch {
    static int binarySearch(int [] arr, int low, int high,int target){
        if(low>high)
        return -1;

        int mid = (low+high)/2;

        if(arr[mid]==target)
        return mid;

        if(arr[mid]>target)
        return binarySearch(arr, low, mid-1, target);

        return binarySearch(arr, mid+1, high, target);
    }
    public static void main(String[] args) {
        // int[] arr = {1,3,5,7,9};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter element");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter searching element");
        int target = sc.nextInt();
        int result = binarySearch(arr, 0, arr.length-1,target);
        if(result != -1){
            System.out.println("found " + result);
        }
        else{
            System.out.println("not found");
        }
    }
}
