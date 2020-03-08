// Planon Enterprise Edition Source file: MaterialResource.java
// Copyright Planon 1997-2020. All Rights Reserved.
package com.amigos.web.rest;

import com.amigos.entity.*;
import com.amigos.repository.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;

import java.util.*;

/**
 * Material Resource (REST API)
 */
@RequestMapping("/api")
@RestController public class MaterialResource
{
  //~ Instance Variables ---------------------------------------------------------------------------

  // ~ Instance Variables
  // ---------------------------------------------------------------------------

  @Autowired MaterialRepository materialRepository;

  //~ Methods --------------------------------------------------------------------------------------

  // ~ Methods
  // --------------------------------------------------------------------------------------

  /**
   * getAllMaterials
   *
   * @return All the materials
   */
  @GetMapping("/materials")
  public ResponseEntity<List<Material>> getAllMaterials()
  {
    return new ResponseEntity<>(materialRepository.findAll(), HttpStatus.OK);
  }


  /**
   * createMaterial
   *
   * @param  material
   *
   * @return the created material with id
   */
  @PostMapping("/material")
  public ResponseEntity<Material> createMaterial(@RequestBody @Valid Material material)
  {
    Material newMaterial = this.materialRepository.save(material);
    return new ResponseEntity<>(newMaterial, HttpStatus.OK);
  }


  /**
   * updateMaterial
   *
   * @param  material
   *
   * @return the created material with id
   */
  @PostMapping("/material")
  public ResponseEntity<Material> updateMaterial(@RequestBody @Valid Material material)
  {
    if (material.getId() != null)
    {
      Optional<Material> foundMaterial = this.materialRepository.findById(material.getId());
      if (foundMaterial.isPresent())
      {
        Material newMaterial = this.materialRepository.save(material);
        return new ResponseEntity<>(newMaterial, HttpStatus.OK);
      }
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }


  /**
   * deleteMaterial
   *
   * @param  id Id of the material to be deleted
   *
   * @return HttpStatus.OK if deleted successfully or HttpStatus.NOT_FOUND
   */
  @DeleteMapping("/material/{id}")
  public ResponseEntity<Void> deleteMaterial(@PathVariable Long id)
  {
    if (id != null)
    {
      this.materialRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
