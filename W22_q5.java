import java.util.*;

public class W22_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String feedback = sc.nextLine().toLowerCase().replaceAll("[.,!?;:]", " ");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        Set<String> stop = new HashSet<>(Arrays.asList(stopWords));
        Map<String, Integer> counts = new HashMap<>();
        for (String word : feedback.trim().split("\\\\s+")) {
            if (!word.isEmpty() && !stop.contains(word))
                counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        List<String> words = new ArrayList<>(counts.keySet());
        words.sort((a, b) -> Integer.compare(counts.get(b), counts.get(a)));
        for (String word : words) System.out.println(word + ": " + counts.get(word));
    }
}
