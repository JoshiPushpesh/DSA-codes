public class Palindrome {
    static boolean isPlaindrome(String str, int start , int end){
        if(start>=end)
        return true;

        if(str.charAt(start)!=str.charAt(end))
        return false;

      return isPlaindrome(str, start+1, end-1);  
    }
    public static void main(String[] args) {
      System.out.println("Enter any string ");
      java.util.Scanner sc = new java.util.Scanner(System.in);
      String str = sc.next();
      System.out.println(isPlaindrome(str, 0,str.length()-1));  
    }
}
