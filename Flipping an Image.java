class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int x1=image.length;
        int x2=image[0].length;
        int temp;
        for(int i=0;i<x1;i++){
            int k=x2-1;
            for(int j=0;j<x2/2;j++){
                temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                k--;
            }
        }
            
         for(int i=0;i<x1;i++){
             for(int j=0;j<x2;j++){
                if(image[i][j]==1){image[i][j]=0;}
                else if(image[i][j]==0){image[i][j]=1;}
             }
            
         }
        
           return image;
    }
}