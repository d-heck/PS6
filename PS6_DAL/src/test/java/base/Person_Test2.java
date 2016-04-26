package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test2 {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PersonDomainModel person;
		LocalDate Date1 = LocalDate.of(1972, 7, 31);
		person = new PersonDomainModel();
		person.setFirstName("David");
		person.setLastName("Cuesta");
		person.setStreet("162 David Hollowell Drive");
		person.setCity("Newark");
		person.setPostalCode(19717);
		person.setBirthday(Date1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test1_deletingFormTheDatabase() {

	}

	@Test
	public void test2_updatingTheDatabase() {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

}