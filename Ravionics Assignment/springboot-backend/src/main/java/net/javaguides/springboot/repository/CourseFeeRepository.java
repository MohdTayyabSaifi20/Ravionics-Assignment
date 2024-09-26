package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseFeeRepository extends JpaRepository<CourseFee, Long> {}
