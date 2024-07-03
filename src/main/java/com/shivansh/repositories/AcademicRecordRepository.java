package com.shivansh.repositories;

import com.shivansh.models.AcademicRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRecordRepository extends JpaRepository<AcademicRecord, Long> {
}