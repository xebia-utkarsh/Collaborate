package com.example.Collaborate.repositories;

import com.example.Collaborate.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
