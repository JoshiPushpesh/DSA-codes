import java.util.*;
public class RemoveDuplicate {
    static StringBuilder result = new StringBuilder();
    static HashSet<Character> set = new HashSet<>();

    static void remove(String str,int index){
        if(index == str.length())
        return;

        if(!set.contains(str.charAt(index)))
        {
            result.append(str.charAt(index));
            set.add(str.charAt(index));
        }
        remove(str, index+1);
    }
   public static void main(String[] args) {
    remove("aabbccdde", 0);
    System.out.println(result);
} 
}
