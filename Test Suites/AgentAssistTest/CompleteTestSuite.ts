<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>CompleteTestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>e124fb98-03e8-4f76-9721-18d6a898758e</testSuiteGuid>
   <testCaseLink>
      <guid>e74fbf13-9d84-47e0-b317-eef20f305d3c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginLogout/Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>10c2ba1b-321d-490b-b9a8-90b2dfef4d55</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntializationAndCampignSetUp</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a71fffd8-63d9-4d47-9523-094a7dcc3583</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/VerifyUIAssertions</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1efe262e-b35d-4721-b42f-e767ecf7856a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Match Intent</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>50794014-27b3-4e08-9a0a-523d7d86d918</guid>
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
         <id>a90c8372-20b8-43fe-a075-957cacc098e3</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>a90c8372-20b8-43fe-a075-957cacc098e3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedIntentJSON</value>
         <variableId>7531f345-c950-44ec-ab21-dd4e585f7428</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>cd580a96-f840-41a8-8e70-abf5d9cfc872</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Remove Intent</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>489a9243-9b66-47ed-a115-7f78f8b180bd</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/IntentManagement/Verify Remove All Intents</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>6873ecb5-8b83-4057-949f-4aa00eef638e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/CategoryTests/Verify GoTo Category Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>e3e64178-a9af-4bd2-8c86-13752670f0a6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/CategoryTests/Verify Match Category</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>b9b4f6e9-1e78-4926-bdaa-7764a80c27be</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>92c6f16e-47ed-4fe5-bed0-3196f18bba48</id>
         <masked>false</masked>
         <name>expectedCategoriesJSON</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/AgentAssistTest/Widget/CategoryTests/Verify Get Categories</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fd4ea841-3bf0-4f93-97a6-2bfc2fbd8f78</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>fd4ea841-3bf0-4f93-97a6-2bfc2fbd8f78</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedCategoriesJSON</value>
         <variableId>92c6f16e-47ed-4fe5-bed0-3196f18bba48</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0cb16ca8-047d-4672-abe5-db820d5c024a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/CategoryTests/Verify Remove Specific Category</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>6a2641cd-ac5f-44d9-a25c-5080ac176d0c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/CategoryTests/Verify Remove All Category</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>75f1fe69-db5b-483b-9078-9bae5e7781e4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/NotificationTests/Verify GoTo Notify Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>51962547-ceb7-43f0-9f54-c204ac4a1a68</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/NotificationTests/Verify All Notify Buttons</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>b8ace871-cd00-4e45-8e80-64e498b0499e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/GPTActionTests/Verify GoTo GPT Action Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>859f1e30-7165-4210-aaaa-dc5ef8c974cb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/GPTActionTests/Verify Add GPT Action</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>f8bff817-cba5-4661-8fbb-cfc48405b7fb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/GPTActionTests/Verify Caller Details Action</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>134f6754-0311-4970-b9bf-a66b1ecfb9c9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/GPTActionTests/Verify Remove GPT Action</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>ad31eccf-3448-4073-b9ea-51d2e1e43811</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/GPTActionTests/Verify Remove All GPT Action</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>44c332f4-7ab0-4c6d-8131-5d775ad07f99</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/EntityTests/Verify GoTo Entities</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>12e3fadd-a1c1-483e-b02d-9c8a8332f3c7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/EntityTests/Verify Add Entities</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0d710448-7478-433e-964b-058f6cfd8eee</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/EntityTests/Verify Get Entities</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7f73626c-5588-4d2e-be0d-5daf4737a78e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/JSON</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>7f73626c-5588-4d2e-be0d-5daf4737a78e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedEntitiesJSON</value>
         <variableId>f156a9ed-f8ef-4230-813e-00cbd8dffce9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c8fa1462-2173-4195-b05c-9ef6cde5e913</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/AskQuestionsTests/GoTo Ask Question</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>4ab9ac4f-878c-4265-853a-b90c09014915</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/AskQuestionsTests/Verify Ask Question</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>df3b252c-46d1-49ea-8090-881be1bd24b9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/GoTo Widget Toggle Tests</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>94cd84ae-0d41-4454-b151-e92b4639bcbe</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/Verify Close Widget</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>d4771719-6d58-4be1-aab8-7b5068027016</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/Verify Toggle Widget</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>3a43128d-fb8b-4f03-9ca6-872f977b6b7a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/Verify Close Widget Again</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>db040fc6-ebf4-4f96-91f0-4838b99e495b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/Verify Open Widget</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>34d7a8af-936f-4be5-9a96-8279617aa750</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/AgentAssistTest/Widget/WidgetToggleTests/Verify Complete Button</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
