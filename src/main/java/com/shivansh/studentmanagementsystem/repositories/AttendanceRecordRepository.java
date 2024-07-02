package com.shivansh.studentmanagementsystem.repositories;

import com.shivansh.studentmanagementsystem.models.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRecordRepository extends JpaRepository<AttendanceRecord, Long> {
}