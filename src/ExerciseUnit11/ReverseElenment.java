package ExerciseUnit11;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseElenment {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Before reverse: " + list);

        Stack<Integer> stack = new Stack<>();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }
        while (stack.size() > 0) {
            list.add(stack.pop());
        }
        System.out.println("After reverse: " + list);
    }
}