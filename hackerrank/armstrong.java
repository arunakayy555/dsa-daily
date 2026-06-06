import java.util.*;

class armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int original = n;  // store original number

        int len = String.valueOf(n).length();
        int sum = 0;

        for(int i = 0; i < len; i++) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if(original == sum) System.out.println("arms!");
        else System.out.println("nopes :)");
    }
}