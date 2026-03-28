package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook gb1;
	private GradeBook gb2;
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(10.0);
		gb1.addScore(20.0);
		gb1.addScore(30.0);
		gb1.addScore(40.0);
		
		gb2.addScore(6.0);
		gb2.addScore(7.1);
		gb2.addScore(51.12);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}
	


	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("10.0 20.0 30.0 40.0"));
		assertTrue(gb2.toString().equals("6.0 7.1 51.12"));
		
		assertEquals(4, gb1.getScoreSize());
		assertEquals(3, gb2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(100.0, gb1.sum(), .0001);
		assertEquals(64.22, gb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(10.0, gb1.minimum(), .0001);
		assertEquals(6.0, gb2.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(90.0, gb1.finalScore(), .0001);
		assertEquals(58.22, gb2.finalScore(), .0001);
	}

}
