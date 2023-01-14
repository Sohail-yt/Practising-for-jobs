import java.util.*;
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a[] = new int[1];
            for (int j = 0; j < 1; j++) {
                a[j] = sc.nextInt();
            }
            if (a[0] == (-a[1])) {
                System.out.println("Yes");
            } else if (a[0] == a[1]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
