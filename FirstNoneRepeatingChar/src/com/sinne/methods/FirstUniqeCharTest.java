package com.sinne.methods;

import static org.junit.Assert.*;
import org.junit.Test;

public class FirstUniqeCharTest {
	
	@Test
	public void test1() {
		FirstUniqeChar firstUniqchar = new FirstUniqeChar();
		assertEquals(2, firstUniqchar.firstUniqeChar("loveleetcode"));
	}
}
