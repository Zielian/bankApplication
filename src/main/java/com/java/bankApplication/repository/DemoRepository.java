package com.java.bankApplication.repository;

import com.java.bankApplication.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Integer> {
}
