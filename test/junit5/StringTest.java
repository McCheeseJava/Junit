package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {

	@BeforeEach
	void test(TestInfo info) {
		System.out.println("hi " + info.getDisplayName());
	}

	@AfterEach
	void test2(TestInfo info) {
		System.out.println("completed " + info.getDisplayName());
	}

	@Test
	@DisplayName("Ensure string length matches")
	void length() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(actualLength, expectedLength);

	}

}
