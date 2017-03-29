import org.apache.commons.lang3.StringUtils;

/**
 * Created by vundicind on 3/26/17.
 */
public class Main {
    public static void main(String[] args) {
        String STR = "https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html";
        System.out.println(StringUtils.abbreviate(STR, 20));
        System.out.println(StringUtils.abbreviate(STR, 5,20));
    }
}
