/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:34:32 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.groupadministration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SetChatDescription_ESTest extends SetChatDescription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long((-1445L));
      SetChatDescription setChatDescription0 = new SetChatDescription(long0, "");
      assertEquals("", setChatDescription0.getDescription());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("q\"9^", ", description='");
      String string0 = setChatDescription0.getDescription();
      assertEquals(", description='", string0);
      assertEquals("q\"9^", setChatDescription0.getChatId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      setChatDescription0.setDescription("");
      String string0 = setChatDescription0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("m[B0K|", "m[B0K|");
      String string0 = setChatDescription0.getChatId();
      assertEquals("m[B0K|", string0);
      assertEquals("m[B0K|", setChatDescription0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("", "");
      String string0 = setChatDescription0.getChatId();
      assertEquals("", setChatDescription0.getDescription());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("", "Wv$dI|.)?v*~7f/");
      // Undeclared exception!
      try { 
        setChatDescription0.setDescription((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      // Undeclared exception!
      try { 
        setChatDescription0.deserializeResponse("{}LT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SetChatDescription setChatDescription0 = null;
      try {
        setChatDescription0 = new SetChatDescription((String) null, "]");
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
      SetChatDescription setChatDescription0 = new SetChatDescription();
      Long long0 = new Long(0L);
      SetChatDescription setChatDescription1 = setChatDescription0.setChatId(long0);
      SetChatDescription setChatDescription2 = setChatDescription1.setDescription("setChatDescription");
      setChatDescription2.validate();
      assertSame(setChatDescription1, setChatDescription2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("", "");
      try { 
        setChatDescription0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      Long long0 = new Long(0L);
      SetChatDescription setChatDescription1 = setChatDescription0.setChatId(long0);
      try { 
        setChatDescription1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Description can't be null
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      try { 
        setChatDescription0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      try { 
        setChatDescription0.deserializeResponse("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      String string0 = setChatDescription0.getMethod();
      assertEquals("setChatDescription", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      String string0 = setChatDescription0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      String string0 = setChatDescription0.toString();
      assertEquals("SetChatDescription{chatId='null', description='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SetChatDescription setChatDescription0 = null;
      try {
        setChatDescription0 = new SetChatDescription((Long) null, "Unable to deserialize response");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      String string0 = setChatDescription0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription();
      SetChatDescription setChatDescription1 = setChatDescription0.setChatId((String) null);
      assertNull(setChatDescription1.getChatId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SetChatDescription setChatDescription0 = new SetChatDescription("", "4Is8Vaa\"7Jh4");
      // Undeclared exception!
      try { 
        setChatDescription0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
