package com.vansah;

public class VansahNodeTests {
	
	//Optional if IssueKey is provided
	private static String testFolderID = "1ba1372f-54ed-11ed-8e52-5658ef8eadd5"; //TestFolder ID to which test Execution is to be perform
	
	//Optional if TestFolder ID is provided
	private static String issueKey = "YUN-2"; //IssueKey to which test Execution is to be perform
	
	//Optional 
	private static String sprintName = "YUN Sprint 1"; //Sprint Name for current sprint for which test execution is to be perform
	
	//Optional
	private static String releaseName = "Release 1"; //Release Name linked with the current sprint and to the test case.
	
	//Optional
	private static String environment = "UAT"; //Environment Name to which test execution of a test case is to be perform
	
	//Required
	private static String testCase = "YUN-C1";

	public static void main(String[] args) throws Exception {

		VansahNode.setVansahToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjb20udmFuc2FoLmppcmEudmFuc2FoLXBsdWdpbiIsImlhdCI6MTczNzUwMzQ1OCwic3ViIjoiNzEyMDIwOmVlNmNlMzUyLTA5NjgtNDJlMS04YTA0LWY3ZjBjZTE1ODRkMyIsImV4cCI6MjczNzUwMzQ1OCwiYXVkIjpbIjRkYWJmYThhLWE4MDMtM2IxMi04OTg3LWZjZjEzYjU4MTAzYiJdLCJ0eXBlIjoiY29ubmVjdCJ9.XtR0AbjH5Po9FcFHl68EjRlw-54wOIU2oUnKzAPq4q8");
        VansahNode.setVansahURL("https://vuat.vansahnode.app");

		//Provide TestFolder ID , JIRA Issue, Sprint Key, Sprint Release and Environment
		VansahNode testExecute = new VansahNode(testFolderID,issueKey);
				
		//From Jira Issue Screen
		// testExecute.addTestRunFromJIRAIssue(testCase);

		// Call the addTestRunFromJIRAIssue method with all required details
		testExecute.addTestRunFromJIRAIssue(
			"My Test Run",               // Name for the planned test run
			issueKey,                    // Use the variable already set
			testCase,                    // Use the variable for the test case
			"2025-01-20",                // Start date
			"2025-01-30",                // End date
			null,                        // Planned Test Run Identifier (null for new test run)
			"All steps passed"           // Actual result or comment 
		);
		
		for (int i = 1; i <= testExecute.testStepCount(testCase); i++) {
			// Add logs for each test step
			testExecute.addTestLog(
				2,                              // Result ID (e.g., 2 for "passed")
				"Step " + i + " executed successfully", // Comment
				i,                              // TestStep ID
				null                            // Screenshot file (if any)
			);
		
		// Update the last log entry
			testExecute.updateTestLog(
				1,                              // Result ID (e.g., 1 for "updated")
				"Final test log updated",       // Comment
				null                            // Screenshot file (if any)
			);
		
		// Optional: Remove test log if necessary
		// testExecute.removeTestLog();
	
		System.out.println("Test execution completed successfully!");
		}

		// testExecute.removeTestRun(); //Removing current test run
	
		//From Test folder screen
		// testExecute.addTestRunFromTestFolder(testCase);
		
		// for(int i = 1;i<=testExecute.testStepCount(testCase);i++) {
			
		// 	//Add logs for each step    function(ResultID, AcutalResultComment, TestStepID, screenshot file);
			
		// 	testExecute.addTestLog(2, "This is From Java Binder Add test log", i, null);
			
		// 	//Will update the current test log
		// 	testExecute.updateTestLog(1, "This is From Java Binder Update Test log", null);
			
		// 	//To remove the current test log
		// 	//testExecute.remove_test_log();
			
		// }
		
		// //Add Quick test for Jira issue  function(testCaseKey, ResultID, AcutalResultComment, screenshot file);
		
		// testExecute.addQuickTestFromJiraIssue(testCase, 0);
		
		// //Add Quick test for Test folders
		// testExecute.addQuickTestFromTestFolders(testCase, 0);
	}


}

