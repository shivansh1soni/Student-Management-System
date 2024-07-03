package com.shivansh.controllers;

import com.shivansh.models.AttendanceRecord;
import com.shivansh.services.AttendanceRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance-records")
public class AttendanceRecordController {
    private final AttendanceRecordService attendanceRecordService;

    public AttendanceRecordController(AttendanceRecordService attendanceRecordService) {
        this.attendanceRecordService = attendanceRecordService;
    }

    @GetMapping
    public List<AttendanceRecord> getAllAttendanceRecords() {
        return attendanceRecordService.getAllAttendanceRecords();
    }

    @GetMapping("/{id}")
    public AttendanceRecord getAttendanceRecordById(@PathVariable Long id) {
        return attendanceRecordService.getAttendanceRecordById(id);
    }

    @PostMapping
    public AttendanceRecord createAttendanceRecord(@RequestBody AttendanceRecord attendanceRecord) {
        return attendanceRecordService.saveAttendanceRecord(attendanceRecord);
    }

    @PutMapping("/{id}")
    public AttendanceRecord updateAttendanceRecord(@PathVariable Long id, @RequestBody AttendanceRecord attendanceRecord) {
        AttendanceRecord existingAttendanceRecord = attendanceRecordService.getAttendanceRecordById(id);
        if (existingAttendanceRecord != null) {
            existingAttendanceRecord.setDate(attendanceRecord.getDate());
            existingAttendanceRecord.setPresent(attendanceRecord.isPresent());
            return attendanceRecordService.saveAttendanceRecord(existingAttendanceRecord);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAttendanceRecord(@PathVariable Long id) {
        attendanceRecordService.deleteAttendanceRecord(id);
    }
}

