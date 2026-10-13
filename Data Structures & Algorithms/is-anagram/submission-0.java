class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        boolean num=false;
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(Arrays.equals(ch,ch2))
        {
            num=true;
        }

        return num;
    }
}
