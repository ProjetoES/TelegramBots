/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:45:27 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.Location;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Location_ESTest extends Location_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Location location0 = new Location();
      String string0 = location0.toString();
      assertEquals("Location{longitude=null, latitude=null}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Location location0 = new Location();
      Float float0 = location0.getLatitude();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Location location0 = new Location();
      Float float0 = location0.getLongitude();
      assertNull(float0);
  }
}
