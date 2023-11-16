package com.example.bib.ripository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bib.entity.Staff;
public interface StaffRepo extends JpaRepository<Staff,
        Integer> {
}