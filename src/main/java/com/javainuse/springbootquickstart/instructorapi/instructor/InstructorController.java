package com.javainuse.springbootquickstart.instructorapi.instructor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.springbootquickstart.instructorapi.instructor.InstructorService;

@RestController
public class InstructorController {
	
    @Autowired
	private InstructorService instructorService;
	
	@RequestMapping("/instructors")
	public List<InstructorImpl> getInstructors() {
        return instructorService.getAllInstructors();								
	}

	@RequestMapping("/instructors/{id}")
	public Optional<InstructorImpl> getInstructor(@PathVariable String id) {
		return instructorService.getInstructor(id);
	}
	
	//Add a new Instructor
	@RequestMapping(method=RequestMethod.POST, value="/instructors")
	public void addInstructor(@RequestBody InstructorImpl Instructor) {
		instructorService.addInstructor(Instructor);
	}
	
	//Update an existing Instructor
	@RequestMapping(method=RequestMethod.PUT, value="/instructors/{id}")
	public void updateInstructor(@PathVariable String id, @RequestBody InstructorImpl Instructor) {
       instructorService.updateInstructor(id, Instructor);	
	}
	
	//Delete an existing Instructor
	@RequestMapping(method=RequestMethod.DELETE, value="/instructors/{id}")
	public void deleteInstructor(@PathVariable String id) {
		 instructorService.deleteInstructor(id);
	}

}
