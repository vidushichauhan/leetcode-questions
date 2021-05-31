class Solution {
    public String truncateSentence(String s, int k) {
     
        String[] arrOfStr = s.split(" ");
        int k1=0;
        String s1="";
        for (String a : arrOfStr)
        {s1=s1+a;
         k1++;
         if(k1==k){break;}
         else{s1=s1+" ";}
        }
         
        return s1;
    }
}