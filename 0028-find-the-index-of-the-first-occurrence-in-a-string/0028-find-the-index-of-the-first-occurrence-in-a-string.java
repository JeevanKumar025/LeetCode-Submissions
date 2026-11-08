class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        if(needle.equals(haystack)) return 0;
        int count = 0;
        for(int i=0; i<=h-n; i++){
            count = 0;
            int k = i;
            for(int j=0; j<n; j++){
                if(needle.charAt(j) == haystack.charAt(k++)){
                    count++;
                }else{
                    count = 0;
                    break;
                }
            }
            if(count == n) return i;
        }
        return -1;
    }
}