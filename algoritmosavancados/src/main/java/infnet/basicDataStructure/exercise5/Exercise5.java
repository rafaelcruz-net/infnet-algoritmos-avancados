package infnet.basicDataStructure.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(Exercise5.convertToOctal("17"));
        System.out.println(Exercise5.convertToOctal("72625"));
        System.out.println(Exercise5.convertToOctal("1"));
        System.out.println(Exercise5.convertToOctal("55142"));
    }
    
    public static int convertToOctal(String oct) {
        int result = 0;
        for (int i = 1; i <= oct.length(); i++) {
            int octDigit = Integer.parseInt(oct.charAt(oct.length() - i) + "");
            result += Math.pow(8, i - 1) * octDigit;
        }
        return result;
    }
}
