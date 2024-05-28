package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "", "", "Equal Book", "", 0);
		Book book2 = new Book(1, "", "", "Equal Book", "", 0);

		assertEquals(true, book1.equals(book2));
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "", "", "Not Equal Book", "", 0);
		Book book2 = new Book(2, "", "", "No, Not Equal", "", 0);
		assertNotEquals(true, book1.equals(book2));
	}

}
