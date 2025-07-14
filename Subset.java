public class Subset {
    static void genrate(String str, String current , int index){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        genrate(str, current + str.charAt(index),index + 1);
        // System.out.println(str + " " + current + " "+ str.charAt(index)+" "+index);
        genrate(str, current, index+1); //  exclude


    }
    public static void main(String[] args) {
        genrate("abc"," ", 0);
    }
}
