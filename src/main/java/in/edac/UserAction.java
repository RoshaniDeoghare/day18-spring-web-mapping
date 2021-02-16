package in.edac;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAction {
	
	
	/**
	 * http://localhost:8080/user/
	 * @return
	 */
	@GetMapping("/")
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		
		User user1 = new User(1, "mumbai", "!@!#!#!#", "mumbai@gmail.com", "212121");
		User user2 = new User(2, "mumbai", "!@!#!#!#", "mumbai@gmail.com", "212121");
		
		list.add(user1);
		list.add(user2);
		
		return list;
	}

	
	/**
	 * http://localhost:8080/user/1
	 * http://localhost:8080/user/2
	 * 	...
	 * http://localhost:8080/user/n
	 * 
	 * http://localhost:8080/user/{id}
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public User getSingleUser(@PathVariable int id) {
		User user = new User(id, "mumbai", "!@!#!#!#", "mumbai@gmail.com", "212121");
		return user;
	}
	
	
	
	/**
	 * http://localhost:8080/user/
	 * @return
	 */
	/*@PostMapping("/")
	public String createUser(String name, String password, String email, String mobile) {
		// Create the Object in database.
		return name + email + password +mobile;
	}*/
	
	@PostMapping("/")
	public User createUser(User user) {
		// Create the Object in database.
		return user;
	}
	
	
	
	/**
	 * http://localhost:8080/user/1
	 * http://localhost:8080/user/2
	 * http://localhost:8080/user/3
	 * ...
	 * http://localhost:8080/user/n
	 * 
	 * 
	 */
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, User user) {
		// ...update the record in datbase
		return user;
	}
	
	
	
	/**
	 * http://localhost:8080/user/1
	 * http://localhost:8080/user/2
	 * http://localhost:8080/user/3
	 * ...
	 * http://localhost:8080/user/n
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public int deleteUser(@PathVariable int id) {
		return id;
	}
	
}












