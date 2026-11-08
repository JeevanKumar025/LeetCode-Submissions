class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            word.replace(0, word.length(), words[i]);
            word.reverse();
            result.append(word);
            result.append(" ");
        }
        return result.toString().trim();
    }
}