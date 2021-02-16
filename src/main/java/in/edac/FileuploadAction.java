package in.edac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file-action")
public class FileuploadAction {

	/**
	 * http://localhost:8080/file-action/
	 * @return
	 */
	@GetMapping("/")
	public String fileAction() {
		return "File Action";
	}
	
	
	
	/**
	 * http://localhost:8080/file-action/1
	 * @return
	 */
	@GetMapping("/1")
	public String fileActionV1() {
		return "File Action V1";
	}
	
}
