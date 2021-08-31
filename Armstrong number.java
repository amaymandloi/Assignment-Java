1.)Armstrong number
public class Armstrong {

    public static void main(String[] args) {

        int n = 371, b, r, a = 0;

        b = n;

        while (b != 0)
        {
            r = b % 10;
            a += Math.pow(r, 3);
            b /= 10;
        }

        if(a == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
