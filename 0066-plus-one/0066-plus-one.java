class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        ArrayList<Integer> al = new ArrayList<>();
        int j = n-1;
        int m = 0;
        while(j>=0 && digits[j] == 9){
            j--;
        }
        if(j==-1){
            int[] result = new int[n+1];
            result[0] = 1;
            for(int i=1; i<n+1; i++){
                result[i] = 0;
            }
            return result;
        }
        int result[] = new int[n];
        
        result[j] = digits[j] + 1;
        for(int k=j+1; k<n; k++){
            result[k] = 0;
        }
        for(int k=j-1; k>=0; k--){
            result[k] = digits[k];
        }
        return result;
    }
}