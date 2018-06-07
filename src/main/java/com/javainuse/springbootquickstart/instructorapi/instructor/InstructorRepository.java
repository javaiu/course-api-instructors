package com.javainuse.springbootquickstart.instructorapi.instructor;

import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<InstructorImpl, String> {

}

