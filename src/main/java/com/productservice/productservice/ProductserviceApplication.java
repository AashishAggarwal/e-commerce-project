package com.productservice.productservice;

import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Order;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.OrderRepository;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.ProductRepository;
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

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// import com.productservice.productservice.inheritancerelations.tableperclass.Mentor;
// import com.productservice.productservice.inheritancerelations.tableperclass.MentorRepository;
// import com.productservice.productservice.inheritancerelations.tableperclass.Student;
// import com.productservice.productservice.inheritancerelations.tableperclass.StudentRepository;
// import com.productservice.productservice.inheritancerelations.tableperclass.User;
// import com.productservice.productservice.inheritancerelations.tableperclass.UserRepository;



@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner{

	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	private final PriceRepository priceRepository;
	private final OrderRepository orderRepository;

	public ProductserviceApplication(CategoryRepository categoryRepository,
									 ProductRepository productRepository,
									 PriceRepository priceRepository,
									 OrderRepository orderRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.priceRepository = priceRepository;
		this.orderRepository = orderRepository;
	}
	// private MentorRepository mentorRepository;
	// private StudentRepository studentRepository;
	// private UserRepository userRepository;

	// private MentorRepository mentorRepository;
	// private StudentRepository studentRepository;
	// private UserRepository userRepository;

	// ProductserviceApplication(@Qualifier("st_mentorrepository") MentorRepository mentorRepository,
	// 						@Qualifier("st_studentrepository") StudentRepository studentRepository, 
	// 						@Qualifier("st_userrepository") UserRepository userRepository) {
	// 	this.mentorRepository = mentorRepository;
	// 	this.studentRepository = studentRepository;
	// 	this.userRepository = userRepository;
	// }

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
		
		// User user = new User();
		// user.setName("Aashish");
		// user.setEmail("aashish@scaler.com");
		// userRepository.save(user);

		// Mentor mentor = new Mentor();
		// mentor.setName("Reaper");
		// mentor.setEmail("reaper@gmail.com");
		// mentor.setAvgRating(4.7);
		// mentorRepository.save(mentor);

		// Student student = new Student();
		// student.setName("Mike");
		// student.setEmail("mike@scaler.com");
		// student.setPsp(98.0);
		// studentRepository.save(student);

//		Category category = new Category();
//		category.setName("Apple Devices");
//
//		Category savedCategory = categoryRepository.save(category);

//		Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("e83d1ce0-be87-441c-befd-ade4bcf038e0"));
//		if (optionalCategory.isEmpty()) {
//			throw new Exception("Category not found");
//		}
//
//		Category category = optionalCategory.get();


//		Product product = new Product();
//		product.setTitle("iPhone 13");
//		product.setDescription("iPhone 13 with 128GB storage");
//		product.setCategory(category.get());
//
//		Product savedProduct = productRepository.save(product);

		// Find all products with category = Apple Devices
//		List<Product> products = category.getProducts();
//		for (Product p : products) {
//			System.out.println(p.getTitle());
//		}

//		Price price = new Price();
//		price.setCurrency("INR");
//		price.setValue(100000);
//
//		Price savedPrice = priceRepository.save(price);
//
//		Category category = new Category();
//		category.setName("Apple Devices");
//		Category savedCategory = categoryRepository.save(category);
//
//		Product product = new Product();
//		product.setTitle("iPhone 13 Pro");
//		product.setDescription("iPhone 13 Pro with 128GB storage");
//		product.setCategory(savedCategory);
//		product.setPrice(savedPrice);
//
//		Product savedProduct = productRepository.save(product);


		priceRepository.deleteById(UUID.fromString("f236986d-86a9-4e3d-aa29-c25873d1cc2b"));


	}

}
