package com.shivansh.controllers;

import com.shivansh.models.AcademicRecord;
import com.shivansh.services.AcademicRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/academic-records")
public class AcademicRecordController {
    private final AcademicRecordService academicRecordService;

    public AcademicRecordController(AcademicRecordService academicRecordService) {
        this.academicRecordService = academicRecordService;
    }

    @GetMapping
    public List<AcademicRecord> getAllAcademicRecords() {
        return academicRecordService.getAllAcademicRecords();
    }

    @GetMapping("/{id}")
    public AcademicRecord getAcademicRecordById(@PathVariable Long id) {
        return academicRecordService.getAcademicRecordById(id);
    }

    @PostMapping
    public AcademicRecord createAcademicRecord(@RequestBody AcademicRecord academicRecord) {
        return academicRecordService.saveAcademicRecord(academicRecord);
    }

    @PutMapping("/{id}")
    public AcademicRecord updateAcademicRecord(@PathVariable Long id, @RequestBody AcademicRecord academicRecord) {
        AcademicRecord existingAcademicRecord = academicRecordService.getAcademicRecordById(id);
        if (existingAcademicRecord != null) {
            existingAcademicRecord.setSubject(academicRecord.getSubject());
            existingAcademicRecord.setGrade(academicRecord.getGrade());
            return academicRecordService.saveAcademicRecord(existingAcademicRecord);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAcademicRecord(@PathVariable Long id) {
        academicRecordService.deleteAcademicRecord(id);
    }
}
