package oops;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class StringManipulator{
    public String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public String Capitalizing(String str){
        return Arrays.stream(str.split(" ")).map(s->s.isEmpty()? s: Character.toUpperCase(s.charAt(0)) + s.substring(1)).collect(Collectors.joining(" "));
    }

  public String append(String original, String toAppend) {
        return original + toAppend;
    }

    public String append(String original, char toAppend) {
        return original + toAppend;
    }

    public String append(String original, int toAppend) {
        return original + toAppend;
    }
}

public class StringTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String input = "java is awesome";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + manipulator.reverseString(input));
        System.out.println("Capitalized: " + manipulator.Capitalizing(input));

        System.out.println("Append String: " + manipulator.append("Hello", " World"));
        System.out.println("Append Char: " + manipulator.append("Hello", '!'));
        System.out.println("Append Int: " + manipulator.append("Total is ", 100));
    }
}
