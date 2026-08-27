first Unique Character
class Main {
    public static void main(String[] args) {
        String s = "leetcode";


        int[] count = new int[26];


        for (char c : s.toCharArray())
            count[c - 'a']++;


        int result = -1;


        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                result = i;
                break;
            }
        }


        System.out.println(result);
    }
}

Input:

leetcode

Output:

0
