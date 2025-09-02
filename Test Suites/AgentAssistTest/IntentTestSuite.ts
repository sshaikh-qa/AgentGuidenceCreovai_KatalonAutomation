<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>IntentTestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>9f961101-4a29-4038-9248-684f886b92a3</testSuiteGuid>
   <testCaseLink>
      <guid>564a1c25-43da-437c-9d66-083841284cae</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>dd8092c7-41d6-4a3f-872f-17eb27971b97</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntializationAndCampignSetUp</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>8eb6ed5b-12b2-40a0-a343-c922bf70e8a7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Match Intent</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5f5fdaf8-bbfe-4ff6-865d-9d4b2d3d3393</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>7531f345-c950-44ec-ab21-dd4e585f7428</id>
         <masked>false</masked>
         <name>expectedIntentJSON</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Get Intents</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>74a70f3a-835d-45d1-b07f-7cd3f2a23df3</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>74a70f3a-835d-45d1-b07f-7cd3f2a23df3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedIntentJSON</value>
         <variableId>7531f345-c950-44ec-ab21-dd4e585f7428</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5c7f7aad-9425-4d98-9014-ac7caf7a1e79</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Remove Intent</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a5e0913f-2f6b-4985-bcd4-b0c2681f26c3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Remove All Intents</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
