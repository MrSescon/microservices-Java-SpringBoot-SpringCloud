package com.sescon.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sescon.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
