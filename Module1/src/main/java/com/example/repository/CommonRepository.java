package com.example.repository;

import com.example.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {

}