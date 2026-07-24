class Solution {
    public int longestConsecutive(int[] nums) {
          if(nums.length==0) return 0;
        HashSet<Integer> map = new HashSet<>();
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }
        for (int num : map) {
            if (map.contains(num - 1)) {
                continue;
            } else {
                int curnum = num;
                int cur = 1;

                while (map.contains(curnum + 1)) {
                    cur++;
                    curnum++;

                }
                res = Math.max(res, cur);
            }

        }

        return res;
    }
}
