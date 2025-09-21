package com.account4.account4.repository;

import com.account4.account4.model.AccountNatureDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountNatureDetailRepository extends JpaRepository<AccountNatureDetail, Long> {
}