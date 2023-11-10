package com.example.projbackendforstudentsdata.DAO;

import com.example.projbackendforstudentsdata.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DAOLayer extends JpaRepository<Student, Integer> {
    // You don't need to provide an implementation for JpaRepository methods here
}

