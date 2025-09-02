<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>AgentAssistFlowTestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>27cd3f29-a15b-4e7e-900d-872498e0822d</testSuiteGuid>
   <testCaseLink>
      <guid>6b13c6fb-4887-479a-a896-ef12c7592b6d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Initialization and Campaign Setup</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a4f56b90-b2b0-4e0a-aa04-90e0037c4592</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify UI Assertions</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>fd3788fd-e64e-43fe-bd8a-2ba129928ce7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Intent Management</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0221a9e8-9ac8-41c3-8e0b-fd8c25fa43c4</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0221a9e8-9ac8-41c3-8e0b-fd8c25fa43c4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedIntentJSON</value>
         <variableId>4f811d04-d2fc-4b9c-8bd5-c9c306d836ba</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>51c8016c-9b6c-4034-90a5-741dfeb652e0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Category Tests</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f97d54ae-abd1-4c85-ba6c-a6b7e45f7bee</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f97d54ae-abd1-4c85-ba6c-a6b7e45f7bee</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedCategoriesJSON</value>
         <variableId>4974182d-d2a1-4733-8e4c-c07b60f5f63e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c3b56a9a-d9e1-4330-9ceb-f5bd03390b5f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Notification Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>8663edd2-4dc8-4510-a964-9a5b2c4dcee2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify GPT Action Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>144fb568-9c8e-414b-b03c-8af982a97700</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Entity Tests</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0b6f4f16-5dc7-412a-b537-4a8e6860fe7c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0b6f4f16-5dc7-412a-b537-4a8e6860fe7c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedEntitiesJSON</value>
         <variableId>1c08442c-ede0-4110-ad51-df1e1a25c48e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c1a867a6-ffb2-4ccc-9e48-7fe9232ad707</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify AI Tab and Question Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>df0b8ce2-4d4c-4e8e-a707-5890247f3c73</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Widget Toggle Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1896cc81-eb34-4819-90a6-9f65c9e7a7ed</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/AgentAssistFlow/Verify Final Steps</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
