<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>LoginTestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>3b6fbec1-cb03-4025-951e-0648514c5195</testSuiteGuid>
   <testCaseLink>
      <guid>ea33076b-80dd-43b8-99b6-3b15f4c080f1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Navigation to Login Page</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>df4f2583-d20b-430c-993a-7330cc70209d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login Page UI Elements</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>00d0221c-c989-41ed-8064-a07eeaafbb11</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login Without Username</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>cb7098b0-2d65-4450-9da9-e7857c1b8080</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login with Invalid Username</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f509cdb6-253d-4c65-84ed-3e8b53dd0835</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f509cdb6-253d-4c65-84ed-3e8b53dd0835</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>invalidUsername</value>
         <variableId>5e066b0b-177e-4785-a575-17e6db8960b8</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f669f33e-488e-4570-9e6c-8ab2448b3097</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login with Valid Username</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c7a57e51-9863-48c8-84a3-0ae914daa05f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login Without Password</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>67a54928-3086-4a09-8dfa-22519625002a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login with Incorrect Password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>aba19673-9037-4f0d-88e2-ba1a4cedae30</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>aba19673-9037-4f0d-88e2-ba1a4cedae30</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>incorrectPassword</value>
         <variableId>4fb15ceb-da82-46e2-893c-3cbcda133bc8</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>93bd25da-40f5-4e2a-b19f-1d9e892df749</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Login with Correct Password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>55b3636b-65ab-4e20-a03d-288790bfec1d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>92394b86-f5b1-40f2-9f13-9684b5f2b6c9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Verify Successful Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>981178ca-4ef2-474d-b606-93c2c883f34a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>592e373d-5dc5-40b1-af28-4ee102938204</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
