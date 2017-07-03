package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class WordCountTest {

    private Wordcount wordcount;

    @Before
    public void before() throws Exception {
        wordcount = new Wordcount();

    }

    @Test
    public void testWordCount() throws Exception {
    assertEquals(3, wordcount.getWordCount("one two three"));
    }

}
