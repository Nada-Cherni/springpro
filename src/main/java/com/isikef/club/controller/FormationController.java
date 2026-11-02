package com.isikef.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isikef.club.entities.Formation;
import com.isikef.club.entities.ThemeFormation;
import com.isikef.club.forms.FormFormation;
import com.isikef.club.service.FormationService;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/formations")
@CrossOrigin (origins ="*", allowedHeaders = "*")

public class FormationController {
  @Autowired 
  FormationService formationService;


  @PostMapping("/create")
  public Formation createFormation(@Valid @ModelAttribute FormFormation form) {
    return formationService.createFormation(form);
  }

  @GetMapping ("/{id}")
  public Formation getFormationById(@PathVariable Long id) {
    return formationService.getFormationById(id);
  }

  @GetMapping 
  public List<Formation> getAllFormations() {
    return formationService.getAllFormations();
  }

  @DeleteMapping ("/{id}")
  public void deleteFormation(@PathVariable Long id) {
    formationService.deleteFormation(id);
  }
  @GetMapping ("/theme/{theme}")
  public List<Formation> findByTheme(@PathVariable String theme) {
    return formationService.getFormationsByTheme(theme);
  }


}