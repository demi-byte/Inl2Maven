package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Loan loan = new Loan(1, new Customer("",
				"",
				"",
				"",
				"",
				"",
				0,
				GenderType.NONBINARY),
				new Book(1, "", "", "", "", 0));

		assertEquals(LocalDate.now().plusDays(14), loan.getDueDate());

   }
}