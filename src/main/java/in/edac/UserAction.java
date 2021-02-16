package in.edac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserAction {

	/**
	 * http://localhost:8080/
	 * @return
	 */
	@GetMapping("/")
	public String helloWorld() {
		return "helloWorld";
	}
	
	
	/**
	 * http://localhost:8080/1
	 * @return
	 */
	@GetMapping("/1")
	public String helloWorldV1() {
		return "helloWorld V1";
	}
	
	
	/**
	 * http://localhost:8080/2
	 * @return
	 */
	@GetMapping("/2")
	public String helloWorldV2() {
		return "helloWorld V2";
	}
	
}
