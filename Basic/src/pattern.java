import java.util.Scanner;
public class pattern {

    public static int swap(int a[], int p, int q) {
        int t = 0;
        t = a[q];
        a[q] = a[p];
        a[p] = t;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[x];

        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        // swap(a, 4, 1);
        for(int i=1;i<=k;i++)
        {
        int p=sc.nextInt();
        int q=sc.nextInt();
        swap(a,p-1,q-1);
        }
        for (int i = 0; i < x; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}