package infnet.basicDataStructure.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        String digit_string1 = "131231231231231231231231231212312312";
        String digit_string2 = "13123123123Z1231231231231231212312312";
        boolean result1 = onlyDigits(digit_string1);
        boolean result2 = onlyDigits(digit_string2);

        System.out.println("First string:");
        System.out.println(digit_string1);
        System.out.println(result1);
        
        System.out.println("\nSecond string:");
        System.out.println(digit_string2);
        System.out.println(result2);
    }

    public static boolean onlyDigits(String digit_string) {
        for (int i = 0; i < digit_string.length(); i++) {
            if (!Character.isDigit(digit_string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
