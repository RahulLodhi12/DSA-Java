package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Merge_Overlapping_Sub_intervals {
    public static int[][] mergeOverlapping_optimal(int[][] intervals){
        int n = intervals.length;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0])); //sort by First column

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(res.isEmpty() || intervals[i][0]>res.get(res.size()-1).get(1)){ //add interval
                res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else{ //update prev. interval
                res.get(res.size()-1).set(1,Math.max(res.get(res.size()-1).get(1),intervals[i][1]));
            }
        }

        int[][] ans = new int[res.size()][2];

        for(int i=0;i<res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j] = sc.nextInt();
            }
        }

        System.out.println("Intervals: ");

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }

        int[][] res = mergeOverlapping_optimal(intervals);
    }
}
