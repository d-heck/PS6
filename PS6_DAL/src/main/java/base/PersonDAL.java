package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.PersonDomainModel;
import util.HibernateUtil;

public class PersonDAL {

	public static PersonDomainModel addPerson(PersonDomainModel per) {
		//PS6 - please implement
		return null;
	}

	public static ArrayList<PersonDomainModel> getPersons() {
		//PS6 - please implement		
		return null;

	}

	public static PersonDomainModel getPerson(UUID perID) {
		//PS6 - please implement		
		return null;
	}

	public static void deletePerson(UUID perID) {
		//PS6 - please implement
	}

	public static PersonDomainModel updatePerson(PersonDomainModel per) {
		//PS6 - please implement		
		return null;
	}
}