<h1>Demo with tests for ecocash</h1>

<h3>USSD - tests</h3>

Real mobile device with sim-card is required. 
[Mobile application](https://github.com/10koteyka01/UssdTestApp) needs to be preinstalled.
Application sends *100# USSD-query to mobile operator and shows response to text view.
Test case sends the query from a mobile device by tapping "next" button and validates the response. 

Steps to run test case:
1. Connect mobile device to pc
2. Run appium-server
3. Check that all settings on Device.java are matching to device from the first point
4. Run test by maven command `mvn test -Dtags=ussd`

<h3>Web UI - tests</h3>

Steps to run test cases:
1. Run test by maven command `mvn test -Dtags=ui`

<h3>To run all tests</h3>

Run maven command `mvn test`

<h3>To type allure report</h3>

1. Run tests like it described beyond
2. Run maven command `mvn allure:report`
3. Run maven command `mvn allure:serve`