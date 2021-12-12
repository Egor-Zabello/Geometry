package data;

import java.util.regex.Pattern;

public class QuadrangleLineValidator {
    public static final String validPoint= "(-)?\\d+\\.\\d+\\s";
    public static final String QUADRANGLE_LINE_REGEX = "((-)?\\d+\\.\\d+\\s){7}(-)?\\d+\\.\\d+";

    public boolean isValidQuadrangle(String line) {
        return Pattern.matches(QUADRANGLE_LINE_REGEX, line);
    }
}
