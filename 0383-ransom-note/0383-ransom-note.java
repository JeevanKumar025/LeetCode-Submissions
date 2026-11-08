class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length();
        int r = ransomNote.length();
        if(m < r) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<m; i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for(int i=0; i<r; i++){
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0) map.remove(ch);
        }
        return true;
    }
}