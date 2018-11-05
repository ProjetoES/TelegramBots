/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 12:53:30 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputTextMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineQueryResultDocument_ESTest extends InlineQueryResultDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setTitle("#/O");
      String string0 = inlineQueryResultDocument0.getTitle();
      assertEquals("#/O", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setTitle("");
      String string0 = inlineQueryResultDocument0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer(0);
      inlineQueryResultDocument0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultDocument0.getThumbWidth();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer((-681));
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultDocument1.getThumbWidth();
      assertEquals((-681), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer(1414);
      inlineQueryResultDocument0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultDocument0.getThumbWidth();
      assertEquals(1414, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setThumbUrl("InputLocationMessageContent{latitude=");
      String string0 = inlineQueryResultDocument0.getThumbUrl();
      assertEquals("InputLocationMessageContent{latitude=", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setThumbUrl("");
      String string0 = inlineQueryResultDocument0.getThumbUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer(0);
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultDocument1.getThumbHeight();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer((-1453));
      inlineQueryResultDocument0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultDocument0.getThumbHeight();
      assertEquals((-1453), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = new Integer(129);
      inlineQueryResultDocument0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultDocument0.getThumbHeight();
      assertEquals(129, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      inlineQueryResultDocument0.setReplyMarkup(inlineKeyboardMarkup0);
      InlineKeyboardMarkup inlineKeyboardMarkup1 = inlineQueryResultDocument0.getReplyMarkup();
      assertSame(inlineKeyboardMarkup1, inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setParseMode("@7F7.H;]qN");
      String string0 = inlineQueryResultDocument1.getParseMode();
      assertEquals("@7F7.H;]qN", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setParseMode("");
      String string0 = inlineQueryResultDocument0.getParseMode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setMimeType("<oV+>!>q//k2@Vk7;,+");
      String string0 = inlineQueryResultDocument1.getMimeType();
      assertEquals("<oV+>!>q//k2@Vk7;,+", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setMimeType("");
      String string0 = inlineQueryResultDocument1.getMimeType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InputTextMessageContent inputTextMessageContent0 = new InputTextMessageContent();
      inlineQueryResultDocument0.setInputMessageContent(inputTextMessageContent0);
      InputTextMessageContent inputTextMessageContent1 = (InputTextMessageContent)inlineQueryResultDocument0.getInputMessageContent();
      assertNull(inputTextMessageContent1.getDisableWebPagePreview());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setId("Y[ ;hL@");
      String string0 = inlineQueryResultDocument1.getId();
      assertEquals("Y[ ;hL@", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setId("");
      String string0 = inlineQueryResultDocument1.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setDocumentUrl("bTMt(ykybj_Rg5");
      String string0 = inlineQueryResultDocument1.getDocumentUrl();
      assertEquals("bTMt(ykybj_Rg5", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setDocumentUrl("");
      String string0 = inlineQueryResultDocument0.getDocumentUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setDescription("FG");
      String string0 = inlineQueryResultDocument0.getDescription();
      assertEquals("FG", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setDescription("");
      String string0 = inlineQueryResultDocument0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setCaption(", livePeriod=");
      String string0 = inlineQueryResultDocument1.getCaption();
      assertEquals(", livePeriod=", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setCaption("");
      String string0 = inlineQueryResultDocument0.getCaption();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setId("B");
      InputContactMessageContent inputContactMessageContent0 = new InputContactMessageContent();
      InlineQueryResultDocument inlineQueryResultDocument2 = inlineQueryResultDocument0.setInputMessageContent(inputContactMessageContent0);
      InlineQueryResultDocument inlineQueryResultDocument3 = inlineQueryResultDocument2.setTitle("B");
      inlineQueryResultDocument3.setMimeType("B");
      InlineQueryResultDocument inlineQueryResultDocument4 = inlineQueryResultDocument1.setDocumentUrl("B");
      try { 
        inlineQueryResultDocument4.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // PhoneNumber parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setMimeType(")WNt8|r}");
      inlineQueryResultDocument1.setTitle("");
      inlineQueryResultDocument0.setId(")WNt8|r}");
      InlineQueryResultDocument inlineQueryResultDocument2 = inlineQueryResultDocument0.setDocumentUrl("text");
      try { 
        inlineQueryResultDocument2.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Title parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setDocumentUrl("d-");
      inlineQueryResultDocument0.setMimeType("d-");
      inlineQueryResultDocument1.setTitle("d-");
      inlineQueryResultDocument0.setId("document");
      inlineQueryResultDocument0.validate();
      assertSame(inlineQueryResultDocument0, inlineQueryResultDocument1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setDocumentUrl("");
      inlineQueryResultDocument0.setId("SCR");
      inlineQueryResultDocument1.setMimeType("SCR");
      try { 
        inlineQueryResultDocument1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DocumentUrl parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setMimeType("");
      inlineQueryResultDocument1.setId("r2D{3,'&`VSNSIFXw-R");
      try { 
        inlineQueryResultDocument1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Mimetype parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setMimeType(")WNt8|r}");
      inlineQueryResultDocument0.setId(")WNt8|r}");
      try { 
        inlineQueryResultDocument0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DocumentUrl parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setId(")WNt8|r}");
      try { 
        inlineQueryResultDocument0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Mimetype parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setId("");
      try { 
        inlineQueryResultDocument0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      try { 
        inlineQueryResultDocument0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = inlineQueryResultDocument0.getThumbWidth();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.toString();
      assertEquals("InlineQueryResultDocument{type='document', id='null', title='null', documentUrl='null', mimeType='null', description='null', caption='null', replyMarkup=null, inputMessageContent=null, thumbUrl='null', thumbWidth=null, thumbHeight=null, parseMode='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InputMessageContent inputMessageContent0 = inlineQueryResultDocument0.getInputMessageContent();
      assertNull(inputMessageContent0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      Integer integer0 = inlineQueryResultDocument0.getThumbHeight();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      InlineQueryResultDocument inlineQueryResultDocument1 = inlineQueryResultDocument0.setReplyMarkup(inlineKeyboardMarkup0);
      InlineQueryResultDocument inlineQueryResultDocument2 = inlineQueryResultDocument0.setDocumentUrl("d-");
      inlineQueryResultDocument0.setMimeType("d-");
      inlineQueryResultDocument2.setTitle("d-");
      InlineQueryResultDocument inlineQueryResultDocument3 = inlineQueryResultDocument0.setId("document");
      inlineQueryResultDocument1.validate();
      assertSame(inlineQueryResultDocument1, inlineQueryResultDocument3);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getCaption();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = inlineQueryResultDocument0.getReplyMarkup();
      assertNull(inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      inlineQueryResultDocument0.setDocumentUrl("d-");
      inlineQueryResultDocument0.setMimeType("d-");
      inlineQueryResultDocument0.setId("document");
      try { 
        inlineQueryResultDocument0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Title parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getThumbUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getType();
      assertEquals("document", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getMimeType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getParseMode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InlineQueryResultDocument inlineQueryResultDocument0 = new InlineQueryResultDocument();
      String string0 = inlineQueryResultDocument0.getDocumentUrl();
      assertNull(string0);
  }
}
