class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex+1;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i=1; i<numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=1; j<i; j++){
                cur.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result.get(rowIndex);
    }
}