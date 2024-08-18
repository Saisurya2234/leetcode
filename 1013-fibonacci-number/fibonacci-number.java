class Solution {
    public int fib(int n) {
        return fibo(n);

        
    }
    public static int fibo(int num){
        if(num<2){
            return num;
        }
        return fibo(num-1)+ fibo(num-2);
    }
}