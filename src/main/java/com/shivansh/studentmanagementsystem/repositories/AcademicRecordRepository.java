package com.shivansh.studentmanagementsystem.repositories;

import com.shivansh.studentmanagementsystem.models.AcademicRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRecordRepository extends JpaRepository<AcademicRecord, Long> {
}