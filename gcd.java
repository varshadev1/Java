import java.util.Scanner;
class gcd
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int A = read.nextInt();
            int B = read.nextInt();
            int[] divisors_AandB = new int[Math.min(A, B)];
            int j = 1, k = 0;
            while (j <= Math.min(A, B)){
                if (A % j == 0 && B % j ==0){
                    divisors_AandB[k++] = j;
                }
                j++;
            }
            int gcd = 0;
            for (int l = 0; l < k; l++){
                if (divisors_AandB[l] > gcd){
                    gcd = divisors_AandB[l];
                }
            }
            int lcm = (A * B) / gcd;
            System.out.println(gcd + " " + lcm);
        }
    }
}
