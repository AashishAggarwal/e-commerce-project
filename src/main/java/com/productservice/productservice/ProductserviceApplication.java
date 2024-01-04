package com.productservice.productservice;

import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Order;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.OrderRepository;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.ProductRepository;
import jakarta.transaction.Transactional;
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

	public ProductserviceApplication(CategoryRepository categoryRepository,
									 ProductRepository productRepository,
									 PriceRepository priceRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.priceRepository = priceRepository;
	}

//	private final CategoryRepository categoryRepository;
//	private final ProductRepository productRepository;
//	private final PriceRepository priceRepository;
//	private final OrderRepository orderRepository;
//
//	public ProductserviceApplication(CategoryRepository categoryRepository,
//									 ProductRepository productRepository,
//									 PriceRepository priceRepository,
//									 OrderRepository orderRepository) {
//		this.categoryRepository = categoryRepository;
//		this.productRepository = productRepository;
//		this.priceRepository = priceRepository;
//		this.orderRepository = orderRepository;
//	}
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
//	@Transactional
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

//		Price savedPrice = priceRepository.save(price);

//		Category category = new Category();
//		category.setName("Apple Devices");
//		Category savedCategory = categoryRepository.save(category);
//
//		Product product = new Product();
//		product.setTitle("iPhone 13 Pro");
//		product.setDescription("iPhone 13 Pro with 128GB storage");
//		product.setCategory(savedCategory);
//		product.setPrice(price);
//
//		Product savedProduct = productRepository.save(product);

//		 productRepository.deleteById(UUID.fromString("14fbd09a-8337-4654-a5d9-7b652e11421c"));

//		Category category = new Category();
//		category.setName("Apple Devices");
//		Category savedCategory = categoryRepository.save(category);
//
//		Price price = new Price();
//		price.setValue(100000);
//		price.setCurrency("INR");


//		Product product = new Product();
//		product.setTitle("iPhone 13 Pro");
//		product.setDescription("Best iphone ever");
//		product.setCategory(category);
//		product.setPrice(price);
//		product.setImage("ImageURL");
//		Product savedProduct = productRepository.save(product);
//
//
//		Price price1 = new Price();
//		price1.setValue(100000);
//		price1.setCurrency("INR");
//
//
//		Product product1 = new Product();
//		product1.setTitle("iPhone 13");
//		product1.setDescription("Best iphone");
//		product1.setCategory(category);
//		product1.setPrice(price1);
//		product1.setImage("ImageURL");
//		Product savedProduct1 = productRepository.save(product1);
//
//
//		Price price2 = new Price();
//		price2.setValue(100000);
//		price2.setCurrency("INR");
//
//		Product product2 = new Product();
//		product2.setTitle("iPhone 13 Pro Max");
//		product2.setDescription("Best iphone ever");
//		product2.setCategory(category);
//		product2.setPrice(price2);
//		product2.setImage("ImageURL");
//		Product savedProduct2 = productRepository.save(product2);

//		Optional<Price> optionalPrice = priceRepository.findById(UUID.fromString("27aeebaa-e071-44b6-8a17-6252e0ac5958"));
//		if (optionalPrice.isEmpty()) {
//			throw new Exception("Price not found");
//		}
//		Price price = optionalPrice.get();


		// Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("0dfbcdd9-c9a1-49a2-aa91-9eed1ab9bb03"));
		// if (optionalCategory.isEmpty()) {
		// 	throw new Exception("Category not found");
		// }
		// Category category = optionalCategory.get();

//		List<Product> products = category.getProducts();
//
//		for (Product p : products) {
//			System.out.println(p.getTitle());
//		}

//	List<Product> products = productRepository.findAll();

//		List<Product> products = productRepository.findAllByTitleAndDescription("Iphone 13", "Best iphone");

		// List<Product> products = productRepository.findByPrice_ValueGreaterThanEqual(50000);


//		List<Product> products = productRepository.findByPrice_ValueLessThanEqual(50000);



//		Category category = new Category();
//		category.setName("Samsung");
//		Category category1 = categoryRepository.save(category);
//
//		Price price = new Price();
//		price.setCurrency("INR");
//		price.setValue(49000);
//
//		Product product = new Product("Samsung Galaxy S21", "Best Samsung phone", "ImageURL", category1, price);
//		productRepository.save(product);

		// List<Product> products = productRepository.findByPrice_ValueBetween(20000, 50000);

	}

}
