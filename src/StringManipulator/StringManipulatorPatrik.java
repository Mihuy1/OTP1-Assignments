package StringManipulator;

public class StringManipulatorPatrik {

    public String reverse(String input) {
        char ch;
        String nstr = "";

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            nstr = ch + nstr;
            System.out.println("Current letter: " + ch);
        }

        System.out.println("Reversed word: " + nstr);

        return nstr;
    }

    public String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static void main(String[] args) {
        StringManipulatorPatrik sm = new StringManipulatorPatrik();

        String testString = "teerg";

        System.out.println(sm.reverse(testString));


    }
}
