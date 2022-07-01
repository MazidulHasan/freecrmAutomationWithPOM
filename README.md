## freecrmAutomationWithPOM
**main/java**<br />
 &nbsp;&nbsp;Base(Mother of all Classes)<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Browser selection<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get primary data from properties<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Set the event listener with the selected browser<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maximize browsers<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Delete all cookies<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Set implicit wait from util package<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Set page load timeout from util package<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit the base URL<br />
  &nbsp;&nbsp;Config<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Base URL<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Username<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Password<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Browser<br />
  &nbsp;&nbsp;Pages<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Folders for the different module which holds pages<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Location of each element in a page<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Constructor that holds PageFactory<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Methods of test cases
  &nbsp;&nbsp;Util<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Basic Util<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Holds the value of page load time out and implicit wait time out<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Main test sheet location<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get the data of the selected sheet name<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Take screenshot method will take a screenshot when it is called<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Event Listener<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Holds all the listeners <br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Before and after a click of each action<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Call screenshot method in onException method<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Add this event listener and integrate it with a browser of the base class<br />
  &nbsp;&nbsp;Report Listener<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ExtentReporterNG is created so that it can work with TestNG<br />
**test/java**<br />
  &nbsp;&nbsp;Testcases<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Folders for the different module which holds pages<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hold the sheet name(If any)<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Constructor that calls the super class constructor(Loads the properties)<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@BeforeMethod<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Setup<br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calls the browser setup method of the superclass<br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Takes all action and goes before the test case that we want to test<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@DataProvider<br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calls the method of Basic Util method of Util package with the selected sheet name<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Test<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Need to set the priority <br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;If it is data-driven then need to set the strings in parameters<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Holds a single scenario of a test case<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@AfterMethod<br />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Quits the browser<br />
**main/resources**<br />
  &nbsp;&nbsp;Testng.xml file<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Holds the extent report listener from ExtentReporterNG of report listener package<br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;We can make this type of file as many as we want according to our test cases. Example: smoke, regression, etc.<br />
**Test-output**<br />
  &nbsp;&nbsp;Holds all the output of the generated results<br />
**Screenshot**<br />
  &nbsp;&nbsp;Holds each screenshot, here each screenshot name is unique. This can be achieved with time.<br />
