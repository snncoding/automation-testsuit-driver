package com.epexspot.automationtestsuitdriver.repository;

import com.epexspot.automationtestsuitdriver.model.Payload;
import com.epexspot.automationtestsuitdriver.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayloadRepository extends JpaRepository<Payload, Integer> {
}
