package com.didt.pagesale.repository;

import com.didt.pagesale.model.RegisterCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterCoursesRepository extends JpaRepository<RegisterCourses, Integer> {
}
