package infnet.basicDataStructure.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        String str = "geeks";

        System.out.println(str + " é Palíndrome: " + isPalindrome(str));
        str = "abba";
        System.out.println(str + " é Palíndrome: " + isPalindrome(str));
    }
    
    static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
