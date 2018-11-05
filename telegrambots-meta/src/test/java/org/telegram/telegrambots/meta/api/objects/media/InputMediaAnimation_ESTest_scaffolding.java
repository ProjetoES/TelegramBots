/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 26 13:48:42 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.media;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class InputMediaAnimation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/home/felipe/eclipse-workspace/TelegramBots/telegrambots-meta"); 
    java.lang.System.setProperty("user.home", "/home/felipe"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "felipe"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InputMediaAnimation_ESTest_scaffolding.class.getClassLoader() ,
      "org.telegram.telegrambots.meta.exceptions.TelegramApiException",
      "org.telegram.telegrambots.meta.api.objects.InputFile",
      "com.fasterxml.jackson.databind.util.Converter",
      "org.telegram.telegrambots.meta.api.objects.media.InputMedia",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.telegram.telegrambots.meta.api.objects.media.InputMediaSerializer",
      "org.telegram.telegrambots.meta.api.interfaces.Validable",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation",
      "com.fasterxml.jackson.databind.util.Converter$None",
      "org.telegram.telegrambots.meta.api.interfaces.InputBotApiObject",
      "com.fasterxml.jackson.databind.JsonSerializer$None",
      "org.telegram.telegrambots.meta.api.objects.InputFileSerializer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(InputMediaAnimation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.telegram.telegrambots.meta.api.objects.media.InputMedia",
      "org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiException",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException",
      "org.telegram.telegrambots.meta.api.objects.InputFile"
    );
  }
}
