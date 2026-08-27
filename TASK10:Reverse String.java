Reverse String
class Main {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};


        int left = 0, right = s.length - 1;


        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;


            left++;
            right--;
        }


        System.out.println(s);
    }
}

Input:

hello

Output:

olleh
