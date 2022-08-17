package com.epexspot.automationtestsuitdriver.repository;

import com.epexspot.automationtestsuitdriver.model.InputParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputParameterRepository extends JpaRepository<InputParameter, Integer> {
}
