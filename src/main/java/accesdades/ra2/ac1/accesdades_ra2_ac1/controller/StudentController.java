package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RestController;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;
import accesdades.ra2.ac1.accesdades_ra2_ac1.respository.StudentRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping("/students/batch")
	public String postStudents() {
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(new Student("Vazgen", "Kocharyan", 20, "DAM", 2));	
		arr.add(new Student("Luis", "Pérez", 21, "DAW", 2));
		arr.add(new Student("María", "López", 19, "DAM", 2));
		arr.add(new Student("Jorge", "Ramírez", 22, "DAW", 1));
		arr.add(new Student("Carla", "Sánchez", 20, "DAM", 1));
		arr.add(new Student("Pedro", "Martínez", 21, "DAW", 2));
		arr.add(new Student("Lucía", "Fernández", 19, "DAM", 2));
		arr.add(new Student("Andrés", "Gómez", 22, "DAW", 1));
		arr.add(new Student("Sofía", "Torres", 20, "DAM", 1));
		arr.add(new Student("Diego", "Ruiz", 21, "DAW", 2));
		
		int numeroRegistres = 0;

		for (int i = 0; i < arr.size(); i++) {
			numeroRegistres += studentRepository.save(arr.get(i).getNom(), arr.get(i).getCognom(), arr.get(i).getAge(), arr.get(i).getCicle(), arr.get(i).getAny());
		}

		return "Successfully added " + numeroRegistres + " students";

	}
	
	@GetMapping("/students")
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

}
