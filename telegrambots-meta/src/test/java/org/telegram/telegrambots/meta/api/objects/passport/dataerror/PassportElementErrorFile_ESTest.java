/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:21:38 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PassportElementErrorFile_ESTest extends PassportElementErrorFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("", "", "");
      PassportElementErrorFile passportElementErrorFile1 = passportElementErrorFile0.setType("vtkz&jARmT]Fklk%");
      String string0 = passportElementErrorFile1.getType();
      assertEquals("vtkz&jARmT]Fklk%", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("", "", "%#tilwT[zsm");
      String string0 = passportElementErrorFile0.getType();
      assertEquals("", passportElementErrorFile0.getFileHash());
      assertEquals("%#tilwT[zsm", passportElementErrorFile0.getMessage());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("Type parameter can't be empty", "Type parameter can't be empty", "Type parameter can't be empty");
      String string0 = passportElementErrorFile0.getMessage();
      assertEquals("Type parameter can't be empty", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      passportElementErrorFile0.setMessage("");
      String string0 = passportElementErrorFile0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("", " in object: ", "+QElfQ5ruB");
      String string0 = passportElementErrorFile0.getFileHash();
      assertEquals(" in object: ", string0);
      assertEquals("", passportElementErrorFile0.getType());
      assertEquals("+QElfQ5ruB", passportElementErrorFile0.getMessage());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      passportElementErrorFile0.setFileHash("");
      String string0 = passportElementErrorFile0.getFileHash();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      // Undeclared exception!
      try { 
        passportElementErrorFile0.setType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      // Undeclared exception!
      try { 
        passportElementErrorFile0.setMessage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = null;
      try {
        passportElementErrorFile0 = new PassportElementErrorFile("", (String) null, "U%a)/Gm");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("p", "p", "p");
      passportElementErrorFile0.validate();
      assertEquals("p", passportElementErrorFile0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      PassportElementErrorFile passportElementErrorFile1 = passportElementErrorFile0.setMessage(" \"YKp");
      passportElementErrorFile0.setFileHash("8@");
      try { 
        passportElementErrorFile1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Type parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      PassportElementErrorFile passportElementErrorFile1 = passportElementErrorFile0.setFileHash(" g`M1%L-1&<o x+s],");
      try { 
        passportElementErrorFile1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Message parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("", " in object: ", "+QElfQ5ruB");
      try { 
        passportElementErrorFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Type parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      try { 
        passportElementErrorFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File hash parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      String string0 = passportElementErrorFile0.getFileHash();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      String string0 = passportElementErrorFile0.toString();
      assertEquals("PassportElementErrorFile{source='file', type='null', fileHash='null', message='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      String string0 = passportElementErrorFile0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("p", "p", "p");
      PassportElementErrorFile passportElementErrorFile1 = passportElementErrorFile0.setMessage("");
      try { 
        passportElementErrorFile1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Message parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      String string0 = passportElementErrorFile0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile();
      String string0 = passportElementErrorFile0.getSource();
      assertEquals("file", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PassportElementErrorFile passportElementErrorFile0 = new PassportElementErrorFile("", "", "");
      try { 
        passportElementErrorFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File hash parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile", e);
      }
  }
}
