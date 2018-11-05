/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:41:14 GMT 2018
 */

package org.telegram.telegrambots.meta.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.interfaces.InputBotApiObject;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorDataField;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TelegramApiValidationException_ESTest extends TelegramApiValidationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException("(K<SRy<:Yg\"yuaLN-r", inlineQueryResultDocument0);
      InlineQueryResultDocument inlineQueryResultDocument1 = (InlineQueryResultDocument)telegramApiValidationException0.getObject();
      assertNull(inlineQueryResultDocument1.getThumbWidth());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException("Address parameter can't be empty", (InputBotApiObject) null);
      PartialBotApiMethod<Serializable> partialBotApiMethod0 = telegramApiValidationException0.getMethod();
      assertNull(partialBotApiMethod0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PassportElementErrorDataField passportElementErrorDataField0 = new PassportElementErrorDataField();
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException((String) null, passportElementErrorDataField0);
      String string0 = telegramApiValidationException0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PartialBotApiMethod<String> partialBotApiMethod0 = (PartialBotApiMethod<String>) mock(PartialBotApiMethod.class, new ViolatedAssumptionAnswer());
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException(".A", partialBotApiMethod0);
      String string0 = telegramApiValidationException0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PartialBotApiMethod<String> partialBotApiMethod0 = (PartialBotApiMethod<String>) mock(PartialBotApiMethod.class, new ViolatedAssumptionAnswer());
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException(".A", partialBotApiMethod0);
      InputBotApiObject inputBotApiObject0 = telegramApiValidationException0.getObject();
      assertNull(inputBotApiObject0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException("org.evosuite.runtime.mock.java.lang.MockThrowable: .A in method: org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod$MockitoMock$954886700@0000000002", (InputBotApiObject) null);
      String string0 = telegramApiValidationException0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PartialBotApiMethod<String> partialBotApiMethod0 = (PartialBotApiMethod<String>) mock(PartialBotApiMethod.class, new ViolatedAssumptionAnswer());
      doReturn(".A").when(partialBotApiMethod0).toString();
      TelegramApiValidationException telegramApiValidationException0 = new TelegramApiValidationException(".A", partialBotApiMethod0);
      PartialBotApiMethod partialBotApiMethod1 = telegramApiValidationException0.getMethod();
      assertNotNull(partialBotApiMethod1);
  }
}
