package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
    College findByCourseName(String courseName);
}
