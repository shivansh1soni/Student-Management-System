package com.shivansh.studentmanagementsystem.services;

import com.shivansh.studentmanagementsystem.models.AttendanceRecord;
import com.shivansh.studentmanagementsystem.repositories.AttendanceRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceRecordService {
    private final AttendanceRecordRepository attendanceRecordRepository;

    public AttendanceRecordService(AttendanceRecordRepository attendanceRecordRepository) {
        this.attendanceRecordRepository = attendanceRecordRepository;
    }

    public List<AttendanceRecord> getAllAttendanceRecords() {
        return attendanceRecordRepository.findAll();
    }

    public AttendanceRecord getAttendanceRecordById(Long id) {
        return attendanceRecordRepository.findById(id).orElse(null);
    }

    public AttendanceRecord saveAttendanceRecord(AttendanceRecord attendanceRecord) {
        return attendanceRecordRepository.save(attendanceRecord);
    }

    public void deleteAttendanceRecord(Long id) {
        attendanceRecordRepository.deleteById(id);
    }
}
