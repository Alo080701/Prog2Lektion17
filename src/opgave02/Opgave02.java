package opgave02;

import opgave01.models.LinkedStack;
import opgave01.models.StackEaaa;

import java.util.Stack;


public class Opgave02 {
    public static void main(String[] args) {
        String lovlig = "(3+{5{99{*}}[23[{67}67]]})";
        String ulovlig = "(}){";

        System.out.println(checkParantes(lovlig));

        System.out.println("-----------------");

        System.out.println(checkParantes(ulovlig));

    }

    public static boolean checkParantes(String s) {
        LinkedStack t = new LinkedStack<String>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                t.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if ((c == ')' && t.peek().equals('(')) || (c == '}' && t.peek().equals('{') || (c == ']' && t.peek().equals('[')))){
                    t.pop();
                }
            }
        }

        return t.isEmpty();
    }
}
