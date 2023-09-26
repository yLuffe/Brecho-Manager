package Util;

public class StringUtil {

    public static String formatString(String input) {
        if (input == null) {
            return null;
        }

        // Remove espaços em branco no início e no final da string
        input = input.trim();

        // Divide a string em palavras usando espaços como delimitadores
        String[] words = input.split(" ");

        // Inicializa uma StringBuilder para construir a string resultante
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Transforma a primeira letra da palavra em maiúscula e o restante em minúscula
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

                // Adiciona a palavra capitalizada à string resultante, seguida de um espaço
                result.append(capitalizedWord).append(" ");
            }
        }
        return result.toString();
    }
}