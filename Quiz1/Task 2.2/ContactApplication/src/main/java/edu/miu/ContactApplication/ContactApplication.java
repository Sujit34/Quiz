package edu.miu.ContactApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.ContactApplication.model.Contact;
import edu.miu.ContactApplication.model.Email;
import edu.miu.ContactApplication.model.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactApplication.class, args);

		List<PhoneNumber> phoneNumbers = new ArrayList<>();
		phoneNumbers.add(new PhoneNumber("1234567890","home"));

		List<Email> emails = new ArrayList<>();
		emails.add(new Email("sujit.chanda@miu.edu","home"));

		List<Contact> contacts = new ArrayList<>();

		contacts.add(new Contact("Sujit Kumar","Chanda","MIU","Student",phoneNumbers,emails));

		printContact(contacts);
	}


	public static void printContact(List<Contact> contacts) {
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		String json = gson.toJson(contacts);
		System.out.println("Contact............................");
		System.out.println(json);
	}
}


