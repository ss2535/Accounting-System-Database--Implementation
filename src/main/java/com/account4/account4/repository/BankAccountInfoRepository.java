package com.account4.account4.repository;

import com.account4.account4.model.BankAccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountInfoRepository extends JpaRepository<BankAccountInfo, Long> {
}
