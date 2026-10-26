class Solution {
    public int romanToInt(String s) {
        String r="IVXLCDM";
        int[] v={1,5,10,50,100,500,1000};
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n=v[r.indexOf(s.charAt(i))];
            if(i+1<s.length()&&n<v[r.indexOf(s.charAt(i+1))])
              sum-=n;
            else
              sum+=n;
        }
        return sum;
        
    }
}