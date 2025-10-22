package com.appdev.wildcatsfinder.gersamiog3.repository;

import com.appdev.wildcatsfinder.gersamiog3.entity.ClaimEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<ClaimEntity, Integer> {
}
