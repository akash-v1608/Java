package namingConventions;

import java.time.LocalDateTime;

class Reverse {
    static void reverseString(String inputText) {
        StringBuilder sb = new StringBuilder(inputText);
        sb.reverse();
        System.out.println("String reversed at time " + LocalDateTime.now());
        System.out.println("Input string : " + sb);
    }
}