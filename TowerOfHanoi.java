public class TowerOfHanoi {
    static void solve(int n, char src, char aux,char dest)
    {
        if(n==0)
        return;
        solve(n-1,src,dest,aux);
        System.out.println("Move disk from " + src + " to " + dest);
        solve(n-1,aux,src,dest);
    }
    public static void main(String[] args) {
        solve(5, 'A','B','C');
    }
}
