import org.apache.commons.lang3.StringUtils;

/**
 * Created by rdumbraveanu on 3/27/2017.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println(StringUtils.abbreviate("Here is a lot of text that should get truncated to the right.", 59));
    System.out.println(StringUtils.abbreviate("Here is a lot of text that should get truncated, but the word 'text' should be visible.", 17, 59));
    //  reverse ellipsis (or start ellipsis)?
    String s3 = "Here is a lot of text that should get truncated to the left.";
    System.out.println(StringUtils.abbreviate(s3, s3.length() - 1,s3.length() / 2));
    System.out.println(StringUtils.abbreviateMiddle("Here is a lot of text that should get ellipsed somewhere in the middle.", "...", 60));
    // Here is some long content that that doesn't fit
  }
}
