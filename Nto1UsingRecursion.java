public class Nto1UsingRecursion {
    static void function(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        function(n-1);
        }
    public static void main(String[] args) {
        function(5);
    }
}
