class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        int n = strs.length;

        for (int i = 1; i < n; i++) {
            int m = Math.min(prefix.length(), strs[i].length());

            for (int j = 0; j < m; j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix.setLength(j);
                    break;
                }
            }

            if (prefix.length() > m) {
                prefix.setLength(m);
            }
        }

        return prefix.toString();
    }
}