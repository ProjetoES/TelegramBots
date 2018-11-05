/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:35:48 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.stickers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.stickers.DeleteStickerFromSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeleteStickerFromSet_ESTest extends DeleteStickerFromSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet();
      String string0 = deleteStickerFromSet0.getSticker();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("QUOTE_FIELD_NAMES");
      String string0 = deleteStickerFromSet0.getSticker();
      assertEquals("QUOTE_FIELD_NAMES", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("");
      // Undeclared exception!
      try { 
        deleteStickerFromSet0.deserializeResponse("{}.fS%MH-Sc{_^3Ff");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.DeleteStickerFromSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = null;
      try {
        deleteStickerFromSet0 = new DeleteStickerFromSet((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("");
      try { 
        deleteStickerFromSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // sticker can't be null
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.DeleteStickerFromSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet();
      deleteStickerFromSet0.setSticker("~");
      deleteStickerFromSet0.validate();
      assertEquals("~", deleteStickerFromSet0.getSticker());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("");
      String string0 = deleteStickerFromSet0.getSticker();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet();
      try { 
        deleteStickerFromSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // sticker can't be null
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.DeleteStickerFromSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("ZN5 Njr) f");
      String string0 = deleteStickerFromSet0.getMethod();
      assertEquals("deleteStickerFromSet", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("ZN5 Njr) f");
      String string0 = deleteStickerFromSet0.toString();
      assertEquals("DeleteStickerFromSet{sticker='ZN5 Njr) f'}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeleteStickerFromSet deleteStickerFromSet0 = new DeleteStickerFromSet("ZN5 Njr) f");
      try { 
        deleteStickerFromSet0.deserializeResponse("DeleteStickerFromSet{sticker='ZN5 Njr) f'}");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.DeleteStickerFromSet", e);
      }
  }
}
