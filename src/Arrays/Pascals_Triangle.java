package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle {
    public static List<List<Integer>> pascals_triangle_variation_3(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int num = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    row.add(num);
                }
            }
            ans.add(row);
        }

        return ans;
    }

    public static void pascals_triangle_variation_2(int n){
        long ans=1;
        System.out.print(ans+" ");

        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
    public static int pascals_triangle_variation_1(int n, int r, int c){
        int v1=1,v2=1,v3=1;

        for(int i=1;i<=r-1;i++){
            v1=v1*i;
        }
        for(int i=1;i<=c-1;i++){
            v2=v2*i;
        }
        for(int i=1;i<=(r-c);i++){
            v3=v3*i;
        }

        int ans = v1/(v2*v3);

        return ans;
    }
    public static void main(String[] args){
        /*
Example 1:
Input Format: N = 5, r = 5, c = 3
Result: 6 (for variation 1)
1 4 6 4 1 (for variation 2)

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1    (for variation 3)

Explanation: There are 5 rows in the output matrix. Each row is formed using the logic of Pascal’s triangle.

Example 2:
Input Format: N = 1, r = 1, c = 1
Result: 1 (for variation 1)
1 (for variation 2)
1 (for variation 3)
Explanation: The output matrix has only 1 row.
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

//        System.out.println("Output (Variation_1): " + pascals_triangle_variation_1(n,r,c));

        System.out.println("Output (Variation_2): ");
        pascals_triangle_variation_2(n);

        System.out.println();

        System.out.println("Output (Variation_3): ");
        List<List<Integer>> ans = pascals_triangle_variation_3(n);
        for(List<Integer> it: ans){
            for(int e: it){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
