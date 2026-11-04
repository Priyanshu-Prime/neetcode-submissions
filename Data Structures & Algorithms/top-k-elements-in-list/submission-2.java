class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i : nums)
        {
            m.putIfAbsent(i,0);
            m.put(i, m.get(i)+1);
        }
        List<Integer>[] freq = new List[nums.length+1];

        for(int i = 0; i < freq.length; i++)
        {
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> e : m.entrySet())
        {
            freq[e.getValue()].add(e.getKey());
        }

        int[] arr = new int[k];
        int ind = 0;

        for(int i = freq.length - 1; i >= 0 && ind < k; i--)
        {
            if(freq[i].size() == 0)
                continue;
            for(int n : freq[i])
            {
                arr[ind++] = n;
            }
        }
        return arr;
    }
}
