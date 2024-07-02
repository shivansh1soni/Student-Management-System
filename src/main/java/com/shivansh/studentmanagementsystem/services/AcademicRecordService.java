package com.shivansh.studentmanagementsystem.services;

import com.shivansh.studentmanagementsystem.models.AcademicRecord;
import com.shivansh.studentmanagementsystem.repositories.AcademicRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicRecordService {
    private final AcademicRecordRepository academicRecordRepository;

    public AcademicRecordService(AcademicRecordRepository academicRecordRepository) {
        this.academicRecordRepository = academicRecordRepository;
    }

    public List<AcademicRecord> getAllAcademicRecords() {
        return academicRecordRepository.findAll();
    }

    public AcademicRecord getAcademicRecordById(Long id) {
        return academicRecordRepository.findById(id).orElse(null);
    }

    public AcademicRecord saveAcademicRecord(AcademicRecord academicRecord) {
        return academicRecordRepository.save(academicRecord);
    }

    public void deleteAcademicRecord(Long id) {
        academicRecordRepository.deleteById(id);
    }
}
