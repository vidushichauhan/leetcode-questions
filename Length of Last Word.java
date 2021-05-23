class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arrOfStr = s.split(" ");
        int x=arrOfStr.length;
        if(x==0){return 0;}
        String f=arrOfStr[x-1];
        
        return f.length();
        
    }
}