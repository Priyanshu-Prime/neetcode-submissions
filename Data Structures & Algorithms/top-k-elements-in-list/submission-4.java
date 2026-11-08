class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums)
        {
            m.putIfAbsent(n,0);
            m.put(n, m.get(n)+1);
        }
        List<Integer>[] arr = new List[nums.length+1]; 

        for(int n : m.keySet())
        {  
            if(arr[m.get(n)] == null)
                arr[m.get(n)] = new ArrayList<>();
            arr[m.get(n)].add(n);
        }
        int ind = 0;
        int[] ans = new int[k];
        for(int i = arr.length-1; i > 0 && ind < k; i--)
        {
            if(arr[i] == null)
                continue;
            for(int n : arr[i])
            {
                ans[ind++] = n; 
                if(ind >= k)
                    break;
            }
        }
        return ans;
    }
}
