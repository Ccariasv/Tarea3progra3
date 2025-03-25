package ValidacionParentesis;

import static ValidacionParentesis.ValidacionParentesis.esBalanceado;

public class Main {
    public static void main(String[] args) {

        String input1 = "[[()]]";
        String input2 = "[[()]";

        System.out.println("Input: \"" + input1 + "\" -> Output: " + esBalanceado(input1));
        System.out.println("Input: \"" + input2 + "\" -> Output: " + esBalanceado(input2));



    }
}
