/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 22 18:50:09 GMT 2018
 */

package org.telegram.abilitybots.api.bot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbilityWebhookBot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.telegram.abilitybots.api.bot.AbilityWebhookBot"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbilityWebhookBot_ESTest_scaffolding.class.getClassLoader() ,
      "org.telegram.telegrambots.meta.api.methods.BotApiMethod",
      "org.telegram.telegrambots.meta.bots.AbsSender",
      "org.telegram.telegrambots.meta.api.methods.GetFile",
      "org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.telegram.telegrambots.meta.api.interfaces.Validable",
      "org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod",
      "org.telegram.telegrambots.bots.DefaultAbsSender",
      "org.apache.http.HttpMessage",
      "org.telegram.abilitybots.api.objects.Privacy",
      "org.apache.http.Consts",
      "org.telegram.abilitybots.api.bot.BaseAbilityBot",
      "org.telegram.abilitybots.api.bot.AbilityWebhookBot",
      "org.telegram.telegrambots.meta.api.methods.GetMe",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiException",
      "org.apache.http.ParseException",
      "org.telegram.telegrambots.meta.api.methods.updates.GetWebhookInfo",
      "org.apache.http.util.Args",
      "org.apache.http.HttpEntity",
      "org.apache.http.entity.ContentType",
      "org.telegram.telegrambots.meta.generics.WebhookBot",
      "org.apache.http.HttpRequest",
      "org.apache.http.util.TextUtils",
      "org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException",
      "org.telegram.abilitybots.api.sender.MessageSender"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbilityWebhookBot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.telegram.telegrambots.meta.bots.AbsSender",
      "org.apache.http.Consts",
      "org.apache.http.util.Args",
      "org.apache.http.util.TextUtils",
      "org.apache.http.entity.ContentType",
      "org.telegram.telegrambots.bots.DefaultAbsSender",
      "org.telegram.abilitybots.api.bot.BaseAbilityBot",
      "org.telegram.abilitybots.api.bot.AbilityWebhookBot",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.mapdb.DBMaker$StoreType",
      "org.telegram.telegrambots.bots.DefaultBotOptions$ProxyType",
      "org.telegram.telegrambots.facilities.TelegramHttpClientBuilder$1",
      "org.apache.http.protocol.HTTP"
    );
  }
}
