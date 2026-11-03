class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String s : strs)
        {
            int[] count = new int[26];
            Arrays.fill(count, 0);
            for(char c : s.toCharArray())
            {
                count[c - 'a']++;
            }
            String st = Arrays.toString(count);
            m.putIfAbsent(st, new ArrayList<>());
            m.get(st).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
