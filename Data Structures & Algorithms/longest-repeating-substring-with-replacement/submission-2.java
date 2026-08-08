class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
      int []arr=new int[26];
      int max=0;int ans=0;
      for(int right=0;right<s.length();right++){
        max=Math.max(max,++arr[s.charAt(right)-'A']);
        if((right-left+1)-max>k){
            arr[s.charAt(left)-'A']--;
            left++;
        }
        ans=Math.max(ans,right-left+1);
      }
      return ans;
    }
}
