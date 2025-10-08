package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class StudentController {

	@PostMapping("/students/batch")
	public String postStudents() {
		return "Hello World!";
	}
	

	@GetMapping("/students")
	public String getStudent() {
		return "Hello World";
	}

}
