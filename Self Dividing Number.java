class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int j=0;
        List<Integer>a= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int x=i,y=i; 
            if(i<=9 && i>=1){a.add(i); continue;}
            while(y!=0){ System.out.println(y);
                  j=y%10; System.out.println(j);   
            if(j!=0){    if(x%j!=0){System.out.println(x+" "+j);break;}}
            
             
                y=y/10;  
            }
            if(y==0){a.add(x);}
        }
        
        return a;
    }
}