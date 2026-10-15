
class Solution {

    public String encode(List<String> strs) {
        String result = "";

        for (String s : strs) {
            result += s.length() + "#" + s;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            ls.add(str.substring(i, i + len));

            i = i + len;
        }

        return ls;
    }
}