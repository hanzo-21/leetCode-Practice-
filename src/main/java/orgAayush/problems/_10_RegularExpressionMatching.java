package orgAayush.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);

        Matcher m = pattern.matcher(s);

        return m.matches();
    }

}
