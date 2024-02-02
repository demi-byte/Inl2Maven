package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		this.book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		assertEquals(1, bc.getNumberOfBooks());
	}

	//G
	@Test
	public void testFindBook() {
		try {
			assertEquals(book1, bc.findBook("Learning Java"));
		} catch (BookNotFoundException e) {
			fail("BookNotFoundException should not be thrown");
		}
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("learning JAVA"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("  Learning Java   "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() {
		assertThrows(BookNotFoundException.class, () -> {
			bc.findBook("doesn't exist");
		});
	}
}
