class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flags[] = new boolean[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90)
                flags[i] = true;
            else
                flags[i] = false;
        }
        if(flags.length == 1) return true;
        if (flags.length == 2) {
            if (flags[0] == false && flags[1] == true) {
                return false;
            } else
                return true;
        }
        if (flags[0] == true) {
            if (flags[1] == true) {
                for (int i = 2; i < flags.length; i++) {
                    if (flags[i] == false)
                        return false;
                }
            } else {
                for (int i = 2; i < flags.length; i++) {
                    if (flags[i] == true)
                        return false;
                }
            }
        } else {
            for (int i = 1; i < flags.length; i++) {
                if (flags[i] == true) {
                    return false;
                }
            }
        }
        return true;
    }
}