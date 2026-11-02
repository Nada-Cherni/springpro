package com.isikef.club.repository;

import com.isikef.club.entities.Formation;
import com.isikef.club.entities.ThemeFormation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {
    @Query ("SELECT f FROM Formation f WHERE Lower(f.theme) LIKE Lower(concat('%', :theme, '%'))")

    public List<Formation> findByThemeContainsIgnoreCase(String theme);
    public List<Formation> findByTheme(ThemeFormation theme);
}
