class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> rows= new ArrayList<>();
            for(int j=0;j<=i;j++){
                rows.add(1);

            }

            for(int j=1;j<i;j++){
                rows.set(j,res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }

            res.add(rows);
        }
        return res;

        
    }
}