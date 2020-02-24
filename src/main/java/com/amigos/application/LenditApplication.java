// Planon Enterprise Edition Source file: LenditApplication.java
// Copyright Planon 1997-2020. All Rights Reserved.
package com.amigos.application;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * LenditApplication
 */
@SpringBootApplication public class LenditApplication
{
  //~ Methods --------------------------------------------------------------------------------------

  /**
   * LenditApplication
   *
   * @param aArguments 
   */
  public static void main(String[] aArguments)
  {
    SpringApplication.run(LenditApplication.class, aArguments);
  }
}
