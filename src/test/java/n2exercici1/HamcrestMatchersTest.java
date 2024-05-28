package n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestMatchersTest{
    @Test
    public void wordShouldHaveLengthOf8() {
        assertThat(HamcrestMatchers.getWord("mordor"), avaluateLength(is(8)));
    }

    public static Matcher<String> avaluateLength(Matcher<Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "Word's length", "length") {
            @Override
            protected Integer featureValueOf(String s) {
                return s.length();
            }
        };
    }
}