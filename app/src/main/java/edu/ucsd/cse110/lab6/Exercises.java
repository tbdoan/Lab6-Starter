package edu.ucsd.cse110.lab6;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.ucsd.cse110.lab6.misc.Constants;

@SuppressWarnings("unused")
public class Exercises {
    public static double mean(List<Integer> numbers) {
        // bug: integer division
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / (double) numbers.size();
    }

    public static double standardDeviation(List<Integer> numbers) {
        double mean = mean(numbers);

        float deviationSum = 0;
        for (int number : numbers) {
            // mean - number -> number - mean
            deviationSum += Math.pow(number - mean, 2);
        }

        int length = numbers.size();
        float variance = deviationSum / length;
        return Math.sqrt(variance);
    }

    public static double exercise1(List<Integer> numbers) {
        return standardDeviation(numbers);
    }

    public static long exercise2(String input) {
        // This pattern matches the spaces between words, as well as punctuation and apostrophes.
        Pattern re = Pattern.compile("('|'s)?[.,;]?[\\s\\n]", Pattern.MULTILINE);
        Stream<String> wordStream = re.splitAsStream(input);
        Set<String> excludedWords = Constants.excludedWords;

        return 0;
    }
}
