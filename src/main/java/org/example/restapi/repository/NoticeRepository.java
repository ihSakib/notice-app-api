package org.example.restapi.repository;

import org.example.restapi.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Integer> {
    // You can define custom queries if necessary.
}
