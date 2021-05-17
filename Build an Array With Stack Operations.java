class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> a=new ArrayList<>();
       // Deque<Integer>d= new ArrayDeque<>();
        int f=0;
        for(int i=0;i<n;i++){
            //a.add("Push");
            if(f>=target.length)
        {
            break;
        }
            if(target[f]==(i+1)){a.add("Push");
                                
                                 f++;}
            else{a.add("Push");a.add("Pop");}
        }
        
       return a; 
    }
}