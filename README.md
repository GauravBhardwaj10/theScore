# theScore
## Table of contents

- Requirements

AndroidStudio AVD
Eclipse
Node
Java
npm
Maven
Appium
AppiumInspector

- Installation
1. Node version  should be 20. you can check your version with below command
node -v
If it is less than 16, please upgrade

2. Appium Server 2.0 version.
You can check your appium version with below command
appium -v
npm uninstall -g appium
npm install -g appium@next

3.  Appium Java client 8.6.0 .
4.  TestNG 7.6.0

- Configuration to run test case
"appium:app": "D:\Eclipse\theScore\src\test\java\appiumAutomation\resources\theScore.apk",
  "appium:deviceName": "GauravDevice",
  "platformName": "android",
  "appium:automationName": "UIAutomator2"
