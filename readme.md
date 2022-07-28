<h1>Demo with tests for ecocash</h1>

<h3>USSD - tests</h3>

Required real mobile device with sim-card, with preinstalled [mobile application](https://github.com/10koteyka01/UssdTestApp).
Application sends *100# query to mobile operator and print response to text view.
Test send query from mobile device by tap button and check response text. 

To run test required:
1. Attach mobile device to pc
2. Run appium-server
3. Check that all settings on Device.java are matches to device from the first point
4. Run test by maven command `mvn test -Dtags=ussd`

<h3>Web UI - tests</h3>

To run test required:
1. Run test by maven command `mvn test -Dtags=ui`

<h3>To run all tests</h3>

Run maven command `mvn test`

<h3>To type allure report</h3>

1. Run tests like it described beyond
2. Run maven command `mvn allure:report`
3. Run maven command `mvn allure:serve`