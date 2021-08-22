package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    // @Query("SELECT s FROM Student s WHERE s.email =?1")
    java.util.Optional<Student> findStudentByEmail(String email);
    
}
