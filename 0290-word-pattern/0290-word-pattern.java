class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != n) return false;
        for(int i=0; i<n; i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                if(map.containsValue(words[i])) return false;
                map.put(ch, words[i]);
            }else{
                if(!map.get(ch).equals(words[i])) return false;
            }
        }
        return true;
    }
}