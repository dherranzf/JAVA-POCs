import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TopWords {

    public static List<Map.Entry<String, Long>> top3(List<String> lines) {
        return lines.stream()
            // Unir todas las líneas en un solo string
            .flatMap(line -> Arrays.stream(
                line.toLowerCase()
                    .replaceAll("[^a-záéíóúüñ\\s]", "") // quita puntuación, deja letras y espacios
                    .split("\\s+")
            ))
            .filter(word -> !word.isBlank())
            .collect(Collectors.groupingBy(
                word -> word, Collectors.counting()
            ))
            .entrySet().stream()
            .sorted(
                Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue)
                    .reversed()
                    .thenComparing(Map.Entry::getKey)
            )
            .limit(3)
            .collect(Collectors.toList());
    }

}