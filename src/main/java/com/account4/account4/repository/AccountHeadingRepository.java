package com.account4.account4.repository;

import com.account4.account4.model.AccountHeading;
import com.account4.account4.model.AccountHeadingSub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountHeadingRepository extends JpaRepository<AccountHeading, Long> {

    List<AccountHeadingSub> findAccountHeadingSubsById(Long id);
}