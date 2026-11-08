class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        StringBuilder vowels = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels.append(c);
            }
        }
        vowels.reverse();
        int j=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                result.delete(i,i+1);
                result.insert(i, vowels.charAt(j++));
            }
        }
        return result.toString();
    }
}