package storm.trident.ml.preprocessing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EnglishTokenizerTest {

	@Test
	public void testTokenize() {
		// Given
		EnglishTokenizer tokenizer = new EnglishTokenizer();
		String text = "I can't argue with some arguments on argus with argues";

		// When
		List<String> actualTokens = tokenizer.tokenize(text);

		// Then
		List<String> expectedTokens = Arrays.asList("i", "can't", "argu", "some", "argument", "argu", "argu");
		assertEquals(expectedTokens, actualTokens);
	}
}