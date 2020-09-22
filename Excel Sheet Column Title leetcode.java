class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            int rem=n%26;
            if(rem==0)
            {
                n-=26;
                rem=26;
            }
            sb.append((char)(rem+64));
            n=n/26;
        }
        return sb.reverse().toString();
    }
}
