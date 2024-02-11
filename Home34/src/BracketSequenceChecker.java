import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class BracketSequenceChecker {

    public static boolean checkBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : sequence.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String inputFile = "F:\\Java\\Home\\Home34\\Resurs\\input.txt";
        String outputFile = "F:\\Java\\Home\\Home34\\Resurs\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                boolean result = checkBracketSequence(line);
                writer.write(line + " Вывод: " + result + "\n");
            }
            System.out.println("Результаты проверки записаны в файл " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
