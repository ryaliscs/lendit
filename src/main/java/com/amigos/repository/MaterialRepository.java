// Planon Enterprise Edition Source file: MaterialRepository.java
// Copyright Planon 1997-2020. All Rights Reserved.
package com.amigos.repository;

import com.amigos.entity.*;

import org.springframework.data.jpa.repository.*;

import java.util.*;

/**
 * MaterialRepository
 */
public interface MaterialRepository extends JpaRepository<Material, Long>
{
  //~ Methods --------------------------------------------------------------------------------------

  /**
   * returns the Material by the given code
   *
   * @param  code Code of the material
   *
   * @return Material for the given {@link Material#getCode()}
   */
  Optional<Material> findOneByCode(String code);
}
