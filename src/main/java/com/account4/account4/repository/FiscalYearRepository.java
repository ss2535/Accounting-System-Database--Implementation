package com.account4.account4.repository;
import com.account4.account4.model.FiscalYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalYearRepository extends JpaRepository<FiscalYear, Long> {

    FiscalYear findByCode(String code);
}

