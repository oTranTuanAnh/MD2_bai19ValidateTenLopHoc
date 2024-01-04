import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public ClassNameValidate() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
