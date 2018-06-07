package com.javainuse.springbootquickstart.instructorapi.instructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {

	@Autowired
	InstructorRepository instructorRepository;
	
	public List<InstructorImpl> getAllInstructors() {
		List<InstructorImpl> instructors = new ArrayList<>();
		instructorRepository.findAll().forEach(instructors::add);
		return instructors;
	}


	public  Optional<InstructorImpl> getInstructor(String id) {
		return instructorRepository.findById(id);
	}

	public void addInstructor(InstructorImpl instructor) {
		instructorRepository.save(instructor);		
	}
	
	public void updateInstructor(String id, InstructorImpl instructor) {	
		instructorRepository.save(instructor);	
	}

	public void deleteInstructor(String id) {
		instructorRepository.deleteById(id);
	}	

}
