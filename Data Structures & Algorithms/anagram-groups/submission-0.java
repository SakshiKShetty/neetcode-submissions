class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           if (strs.length == 0)
            return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] array = new int[26];
            for (int i = 0; i < str.length(); i++) {
                array[str.charAt(i) - 'a']++;
            }

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                s.append('#');//if this is not added then the string willbe like 111 here we cant seprate wheher its 3 1 or group so add # so it seperates eacj bit
                s.append(array[i]);
            }
            String key = s.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
