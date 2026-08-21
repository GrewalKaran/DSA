class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            int l = i+1;
            int r = nums.length-1;
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            } 
            while(l<r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    List<Integer>arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    res.add(arr);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                        }
                    }
                else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }
                else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }
            }
        }
            return res;
        }
    }
