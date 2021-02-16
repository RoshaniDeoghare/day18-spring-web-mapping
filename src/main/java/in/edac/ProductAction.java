package in.edac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAction {

	/**
	 * http://localhost:8080/product/
	 * @return
	 */
	@GetMapping("/")
	public String productDemo() {
		return "Product";
	}
	
	
	@GetMapping("/1")
	public String productDemoV1() {
		return "Product V1";
	}
}
