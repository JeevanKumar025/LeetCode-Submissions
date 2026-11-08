class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char S = s.charAt(i);
            char T = t.charAt(i);

            if(!map.containsKey(S)) {
                if(map.containsValue(T)) return false;
                map.put(S, T);
            }
            else if(map.get(S) != T) return false;
        }

        return true;
    }
}