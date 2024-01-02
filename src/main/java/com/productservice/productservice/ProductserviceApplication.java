package com.productservice.productservice;

import org.springframework.beans.factory.annotation.Qualifier;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productservice.productservice.inheritancerelations.singletable.Mentor;
import com.productservice.productservice.inheritancerelations.singletable.MentorRepository;
import com.productservice.productservice.inheritancerelations.singletable.Student;
import com.productservice.productservice.inheritancerelations.singletable.StudentRepository;
import com.productservice.productservice.inheritancerelations.singletable.User;
import com.productservice.productservice.inheritancerelations.singletable.UserRepository;

// import com.productservice.productservice.inheritancerelations.tableperclass.Mentor;
// import com.productservice.productservice.inheritancerelations.tableperclass.MentorRepository;
// import com.productservice.productservice.inheritancerelations.tableperclass.Student;
// import com.productservice.productservice.inheritancerelations.tableperclass.StudentRepository;
// import com.productservice.productservice.inheritancerelations.tableperclass.User;
// import com.productservice.productservice.inheritancerelations.tableperclass.UserRepository;



@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner{
	// private MentorRepository mentorRepository;
	// private StudentRepository studentRepository;
	// private UserRepository userRepository;

	private MentorRepository mentorRepository;
	private StudentRepository studentRepository;
	private UserRepository userRepository;

	ProductserviceApplication(@Qualifier("st_mentorrepository") MentorRepository mentorRepository,
							@Qualifier("st_studentrepository") StudentRepository studentRepository, 
							@Qualifier("st_userrepository") UserRepository userRepository) {
		this.mentorRepository = mentorRepository;
		this.studentRepository = studentRepository;
		this.userRepository = userRepository;
	}

	// ProductserviceApplication(@Qualifier("tpc_mentorrepository") MentorRepository mentorRepository,
	// StudentRepository studentRepository, UserRepository userRepository) {
	// 	this.mentorRepository = mentorRepository;
	// 	this.studentRepository = studentRepository;
	// 	this.userRepository = userRepository;
	// }

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// tpc_mentor
		// Mentor mentor = new Mentor();
		// mentor.setName("Aashish");
		// mentor.setEmail("aashish@gmail.com");
		// mentor.setAvgRating(4.7);

		// mentorRepository.save(mentor);

		// Student student = new Student();
		// student.setEmail("reaper@gmail.com");
		// student.setName("Reaper");
		// student.setPsp(90.0);
		
		// studentRepository.save(student);

		// User user = new User();
		// user.setEmail("mike@gmail.com");
		// user.setName("Mike");
		
		// userRepository.save(user);

		// List<User> users = userRepository.findAll();

		// for (User u : users) {
		// 	System.out.println(u.toString());
		// }
		
		User user = new User();
		user.setName("Aashish");
		user.setEmail("aashish@scaler.com");
		userRepository.save(user);

		Mentor mentor = new Mentor();
		mentor.setName("Reaper");
		mentor.setEmail("reaper@gmail.com");
		mentor.setAvgRating(4.7);
		mentorRepository.save(mentor);

		Student student = new Student();
		student.setName("Mike");
		student.setEmail("mike@scaler.com");
		student.setPsp(98.0);
		studentRepository.save(student);


	}

}
