package Arrays;

import java.util.*;

public class Three_Sum_Find_triplets_that_sum_to_zero {
    public static List<List<Integer>> three_sum_optimal(int[] nums){ //sorting + fixed 'i' pointer and move 'j' and 'k'
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            //skip duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    //skip duplicates
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
    public static List<List<Integer>> three_sum_betterSolution(int[] nums){ //2 loops - nested
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            Set<Integer> mpp = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);

                if(mpp.contains(third)){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(third);
                    Collections.sort(res);
                    st.add(res);
                }

                mpp.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> three_sum_bruteForce(int[] nums){ //3 loops - nested
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n && i!=j;j++){
                for(int k=0;k<n && j!=k;k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        Collections.sort(res);
                        st.add(res);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Array");

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

//        List<List<Integer>> ans = three_sum_bruteForce(nums);

//        List<List<Integer>> ans = three_sum_betterSolution(nums);

        List<List<Integer>> ans = three_sum_optimal(nums);

        System.out.println("Output: ");
        for(List<Integer> it: ans){
            for(int e: it){
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}
