
class Solution {
public List<List<String>> groupAnagrams(String[] arr) {


    List<List<String>> result = new ArrayList<>();
    boolean[] visited = new boolean[arr.length];

    for (int i = 0; i < arr.length; i++) {

        if (visited[i]) {
            continue;
        }

        List<String> list = new ArrayList<>();
        list.add(arr[i]);
        visited[i] = true;

        char[] ch = arr[i].toCharArray();
        Arrays.sort(ch);

        for (int j = i + 1; j < arr.length; j++) {

            if (visited[j]) {
                continue;
            }

            char[] ch2 = arr[j].toCharArray();
            Arrays.sort(ch2);

            if (Arrays.equals(ch, ch2)) {
                list.add(arr[j]);
                visited[j] = true;
            }
        }

        result.add(list);
    }

    return result;
}


}
