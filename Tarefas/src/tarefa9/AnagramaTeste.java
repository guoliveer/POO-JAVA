package tarefa9;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTeste {

	@Test
	public void test() {
		assertTrue(Anagrama.eAnagrama("",""));
		assertTrue(Anagrama.eAnagrama(" ",""));
		assertTrue(Anagrama.eAnagrama("a","a "));
		assertFalse(Anagrama.eAnagrama("a ","b"));
		assertTrue(Anagrama.eAnagrama("ab","ab"));
		assertTrue(Anagrama.eAnagrama("ab","a b"));
		assertTrue(Anagrama.eAnagrama("b a","a b"));
		assertTrue(Anagrama.eAnagrama("ab", "ba"));
		assertFalse(Anagrama.eAnagrama("ba", "a"));
		assertTrue(Anagrama.eAnagrama("amor", "roma"));
		assertTrue(Anagrama.eAnagrama("alan smithee", "the alias men"));
		assertFalse(Anagrama.eAnagrama("amoor", "roma"));
		assertFalse(Anagrama.eAnagrama("Batata", "Banana"));
	}

}
