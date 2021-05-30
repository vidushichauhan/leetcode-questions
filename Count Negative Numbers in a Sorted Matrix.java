class Solution {
    public int countNegatives(int[][] grid) {
        
        int x=grid.length;
        int y=grid[0].length;
        int count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}