class Solution {
    public boolean isPalindrome(String s) {
      s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char ch[]=s.toCharArray();
        boolean res=false;
        char ch2[]=new char[s.length()];
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            ch2[count]=ch[i];
            count++;
        }
        String s1=new String(ch2);
        if(s.equals(s1))
        {
            res=true;
        }

        return res;
    }
}
