public class CamelCaseConverter {
    public static void main(String[] args) {
        String sentence = "Какой замечательный, однако, день!";
        String lowerCamelCase = toLowerCamelCase(sentence);
        System.out.println("lowerCamelCase: " + lowerCamelCase);

        String normalSentence = fromLowerCamelCase(lowerCamelCase);
        System.out.println("Normal sentence: " + normalSentence);
    }

    public static String toLowerCamelCase(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }
        return result.toString();
    }

    public static String fromLowerCamelCase(String lowerCamelCase) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowerCamelCase.length(); i++) {
            char c = lowerCamelCase.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(" ");
            }
            result.append(Character.toLowerCase(c));
        }
        return result.toString().trim();
    }
}

