package com.epexspot.automationtestsuitdriver.repository;

import com.epexspot.automationtestsuitdriver.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Integer> {
}
