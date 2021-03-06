package com.example.cs5200sp2020dharmeprajaktajpa.repositories;

import com.example.cs5200sp2020dharmeprajaktajpa.models.Enrollment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {
}
