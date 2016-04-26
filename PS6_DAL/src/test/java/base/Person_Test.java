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

public class Person_Test {

	private static PersonDomainModel person;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		LocalDate date = LocalDate.of(1997, 4, 23);
		person = new PersonDomainModel();
		person.setFirstName("David");
		person.setLastName("Heck");
		person.setBirthday(date);
		person.setCity("Hockessin");
		person.setPostalCode(19707);
		person.setStreet("123 Hockessin Alley");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		PersonDomainModel per;	
		PersonDAL.deletePerson(person.getPersonID());
		per = PersonDAL.getPerson(person.getPersonID());
		assertNull("Bad Data (Person)",per);		
	}
	

	@Test
	public void DeletePersonTest()
	{		
		PersonDomainModel per;		
		per = PersonDAL.getPerson(person.getPersonID());		
		assertNull("This person shouldn't be there: ",per);	
		
		PersonDAL.addPerson(person);			
		per = PersonDAL.getPerson(person.getPersonID());
		System.out.println(person.getPersonID() + " found");
		assertNotNull("This person should be in there: ",per);
		
		PersonDAL.deletePerson(person.getPersonID());
		per = PersonDAL.getPerson(person.getPersonID());		
		assertNull("This person shouldn't be there: ",per);	
		
	}
	
	@Test
	public void AddPersonTest()
	{		
		PersonDomainModel per;
		
		per = PersonDAL.getPerson(person.getPersonID());
		assertNull("Person is not in there:",per);
		
		PersonDAL.addPerson(person);	
		
		per = PersonDAL.getPerson(person.getPersonID());
		System.out.println(person.getPersonID() + " found");
		assertNotNull("Person should be in there:",per);
	}
	
	@Test
	public void UpdatePersonTest(){		
		PersonDomainModel per;
		
		final String LASTNAME = "Peck";
		
		per = PersonDAL.getPerson(person.getPersonID());		
		assertNull("This person shouldn't be there: ",per);		
		PersonDAL.addPerson(person);	
		
		person.setLastName(LASTNAME);
		PersonDAL.updatePerson(person);
		
		per = PersonDAL.getPerson(person.getPersonID());

		assertTrue("Name didn't change", person.getLastName() == LASTNAME);
	}
	
	@Test
	public void Test(){
		assertTrue(1==1);
	}
}