package com.example.Spring_boot_app.repository;

import com.example.Spring_boot_app.dto.QuestionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionDto,Long> {
    // Add custom query methods if needed
}