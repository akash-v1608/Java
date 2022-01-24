package namingConventions;
import java.time.*;
class Append {
    static void appendString(String inputText, String nextWord) {
        StringBuilder sb = new StringBuilder(inputText);
        sb.append(nextWord);
        System.out.println("String reversed at time " + LocalDateTime.now());
        System.out.println("New String after appending is " + sb);
    }
}
