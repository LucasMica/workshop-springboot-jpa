package com.javastudy.course.repositories;

import com.javastudy.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
