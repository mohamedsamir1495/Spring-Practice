package com.mohamedsamir1495.springdata.relations;

import com.mohamedsamir1495.springdata.relations.manytomany.entities.Programmer;
import com.mohamedsamir1495.springdata.relations.manytomany.entities.Project;
import com.mohamedsamir1495.springdata.relations.manytomany.repos.ProgrammerRepository;
import com.mohamedsamir1495.springdata.relations.onetomany.entities.Customer;
import com.mohamedsamir1495.springdata.relations.onetomany.entities.PhoneNumber;
import com.mohamedsamir1495.springdata.relations.onetomany.repos.CustomerRepository;
import com.mohamedsamir1495.springdata.relations.onetoone.entities.License;
import com.mohamedsamir1495.springdata.relations.onetoone.entities.Person;
import com.mohamedsamir1495.springdata.relations.onetoone.repos.LicenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationsApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Autowired
	ProgrammerRepository programmerRepository;

	@Autowired
	LicenseRepository licenseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateCustomer() {

		Customer customer = new Customer();
		customer.setName("John");

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("1234567890");
		ph1.setType("cell");

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("0987654321");
		ph2.setType("home");

		customer.addPhoneNumber(ph1);
		customer.addPhoneNumber(ph2);

		repository.save(customer);
	}

	@Test
	@Transactional  // mark as transactional for lazy loading to work , if eager you can remove it
	public void testLoadCustomer() {
		Customer customer = repository.findById(4L).get();
		System.out.println(customer.getName());

		Set<PhoneNumber> numbers = customer.getNumbers();
		numbers.forEach(number -> System.out.println(number.getNumber()));

	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = repository.findById(4L).get();
		customer.setName("John Bush");

		Set<PhoneNumber> numbers = customer.getNumbers();
		numbers.forEach(number -> number.setType("cell"));

		repository.save(customer);

	}

	@Test
	public void testDelete() {
		repository.deleteById(4l);
	}

	@Test
	public void testmtomCreateProgrammer() {
		Programmer programmer = new Programmer();
		programmer.setName("John");
		programmer.setSal(10000);

		HashSet<Project> projects = new HashSet<>();
		Project project = new Project();
		project.setName("Hibernate Project");
		projects.add(project);

		programmer.setProjects(projects);

		programmerRepository.save(programmer);
	}

	@Test
	@Transactional
	public void testmtomFindProgrammer() {
		Programmer programmer = programmerRepository.findById(1).get();
		System.out.println(programmer);
		System.out.println(programmer.getProjects());
	}

	@Test
	public void testOneToOneCreateLicense() {
		License license = new License();
		license.setType("CAR");
		license.setValidFrom(new Date());
		license.setValidTo(new Date());

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Clinton");
		person.setAge(35);

		license.setPerson(person);

		licenseRepository.save(license);
	}

}
