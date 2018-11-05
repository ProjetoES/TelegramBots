/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:29:38 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.groupadministration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnbanChatMember_ESTest extends UnbanChatMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      Integer integer0 = unbanChatMember0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(0);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(long0, integer0);
      Integer integer1 = unbanChatMember0.getUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-20));
      UnbanChatMember unbanChatMember0 = new UnbanChatMember("org.elegram.telegrambots.meta.api.methods.groupdministration.UnbanChatember$1", integer0);
      unbanChatMember0.getUserId();
      assertEquals("org.elegram.telegrambots.meta.api.methods.groupdministration.UnbanChatember$1", unbanChatMember0.getChatId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      String string0 = unbanChatMember0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(1);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(", userId='", integer0);
      // Undeclared exception!
      try { 
        unbanChatMember0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      // Undeclared exception!
      try { 
        unbanChatMember0.deserializeResponse("null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = null;
      try {
        unbanChatMember0 = new UnbanChatMember("~'~d&cE", (Integer) null);
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
      Long long0 = new Long(0L);
      UnbanChatMember unbanChatMember0 = null;
      try {
        unbanChatMember0 = new UnbanChatMember(long0, (Integer) null);
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
      Long long0 = new Long(1845L);
      Integer integer0 = new Integer(8);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(long0, integer0);
      unbanChatMember0.setChatId("");
      try { 
        unbanChatMember0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Long long0 = new Long(1845L);
      Integer integer0 = new Integer(8);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(long0, integer0);
      unbanChatMember0.validate();
      assertEquals("1845", unbanChatMember0.getChatId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      try { 
        unbanChatMember0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      Long long0 = new Long(0L);
      UnbanChatMember unbanChatMember1 = unbanChatMember0.setChatId(long0);
      try { 
        unbanChatMember1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // UserId can't be null
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(1339);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember("[Z\"$W", integer0);
      unbanChatMember0.getUserId();
      assertEquals("[Z\"$W", unbanChatMember0.getChatId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = new Long(1845L);
      Integer integer0 = new Integer(8);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(long0, integer0);
      String string0 = unbanChatMember0.toString();
      assertEquals("UnbanChatMember{chatId='1845', userId='8}", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnbanChatMember unbanChatMember0 = new UnbanChatMember();
      String string0 = unbanChatMember0.getMethod();
      assertEquals("unbanchatmember", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(1339);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember("[Z\"$W", integer0);
      String string0 = unbanChatMember0.getChatId();
      assertEquals("[Z\"$W", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Long long0 = new Long(1845L);
      Integer integer0 = new Integer(8);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember(long0, integer0);
      UnbanChatMember unbanChatMember1 = unbanChatMember0.setUserId(integer0);
      assertSame(unbanChatMember1, unbanChatMember0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(1339);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember("[Z\"$W", integer0);
      unbanChatMember0.setChatId("");
      unbanChatMember0.getChatId();
      assertEquals("", unbanChatMember0.getChatId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(1339);
      UnbanChatMember unbanChatMember0 = new UnbanChatMember("[Z\"$W", integer0);
      try { 
        unbanChatMember0.deserializeResponse("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember", e);
      }
  }
}
