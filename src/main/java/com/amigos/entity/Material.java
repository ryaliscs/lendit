// Planon Enterprise Edition Source file: Material.java
// Copyright Planon 1997-2020. All Rights Reserved.
package com.amigos.entity;

import javax.persistence.*;

/**
 * Material Entity
 */
@Entity public class Material
{
  //~ Instance Variables ---------------------------------------------------------------------------

  // ~ Instance Variables
  // ---------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;
  private String code;
  private String name;

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * getId
   *
   * @return the id
   */
  public Long getId()
  {
    return id;
  }


  /**
   * setId
   *
   * @param id the id to set
   */
  public void setId(Long id)
  {
    this.id = id;
  }


  /**
   * getCode
   *
   * @return the code
   */
  public String getCode()
  {
    return code;
  }


  /**
   * setCode
   *
   * @param code the code to set
   */
  public void setCode(String code)
  {
    this.code = code;
  }


  /**
   * getName
   *
   * @return the name
   */
  public String getName()
  {
    return name;
  }


  /**
   * setName
   *
   * @param name the name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }


  /**
   * {@inheritDoc}
   */
  @Override public String toString()
  {
    return String.format("Material[id=%d, code='%s', name='%s']", this.id, this.code, this.name);
  }
}
