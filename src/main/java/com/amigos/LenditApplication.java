package com.amigos;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * LenditApplication: this is a starting point of the application
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
