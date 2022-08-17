package com.epexspot.automationtestsuitdriver.repository;

import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<Step, Integer> {
}
