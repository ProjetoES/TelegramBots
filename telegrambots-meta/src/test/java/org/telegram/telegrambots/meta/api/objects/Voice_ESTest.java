/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:48:36 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.Voice;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Voice_ESTest extends Voice_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Voice voice0 = new Voice();
      String string0 = voice0.toString();
      assertEquals("Voice{fileId='null', duration=null, mimeType='null', fileSize=null}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Voice voice0 = new Voice();
      String string0 = voice0.getMimeType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Voice voice0 = new Voice();
      Integer integer0 = voice0.getFileSize();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Voice voice0 = new Voice();
      Integer integer0 = voice0.getDuration();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Voice voice0 = new Voice();
      String string0 = voice0.getFileId();
      assertNull(string0);
  }
}
