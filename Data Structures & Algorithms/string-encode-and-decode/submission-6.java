class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.size(); i++)
        {
            sb.append(strs.get(i));
            sb.append("|#|");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        List<String> l = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == '|' && str.charAt(i+1) == '#' && str.charAt(i+2) == '|')
            {
                l.add(sb.toString());
                sb.setLength(0);
                i = i + 2;
                continue;
            }
            sb.append(c);
        }
        System.out.println(l);
        return l;
    }
}
