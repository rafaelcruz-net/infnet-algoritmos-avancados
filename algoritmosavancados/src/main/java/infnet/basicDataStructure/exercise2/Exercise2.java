package infnet.basicDataStructure.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        String main_string = "abcd abc aabc baa abcaa";
        String sub_string = "aa";
        int countV1 = countSubstrInString(main_string, sub_string);
        System.out.println(sub_string + "' has occured " + countV1 + " times in '" + main_string + "'");
    }

    public static int countSubstrInString(String main_string, String sub_string) {
        int position = 0;
        int ctr = 0;
        int n = sub_string.length();

        while ((position = main_string.indexOf(sub_string, position)) != -1) {
            position = position + n;
            ctr++;
        }

        return ctr;
    }
}
