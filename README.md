# App Automation on Google Calculator with Selenium Appium

## What does App Automation with Selenium Appium mean?

App automation with Selenium Appium is the process of automating mobile applications using the Appium tool. It allows developers and testers to create and run automated tests for mobile applications on both Android and iOS platforms. With Appium, you can write and execute automated tests that simulate user actions, such as clicking buttons, entering text, and swiping screens.

App automation with Selenium Appium is beneficial because it allows developers and testers to catch issues and bugs early in the development cycle, thus reducing the time and cost associated with manual testing. Additionally, Appium enables cross-platform testing, allowing you to write tests once and run them across multiple devices and operating systems.

## Technology used:

- Selenium Webdriver
- Appium
- Intellij 
- Android Studio
- Appium Inspector
- Gradle
- Java

## How to run this project:

- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration 
- Hit this command in cmd for checking the connectivity with emulator : ``adb devices``
- Open Appium Server with following command: ```appium -p 4723```
- Open Appium Inspector
- Set desired capabilites in json format:
``` 
 {
 "appium:deviceName": "emulator",
  "appium:uuid": "emulator-5554",
  "platformName": "Android",
  "appium:platformVersion": "11",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:app": "D:\\APK\\calculator.apk"
  }
```
- Open Intellij Idea
- Hit the following command into the terminal: ```gradle clean test```
- For generating Allure Report use these commands: ```allure generate allure-results --clean -o allure-report``` and ```allure serve allure-results```


## What I have done based on scenerio:

- Sum of 2 numbers (9+5=14)
- Subtraction of 2 numbers (8-3=5)
- multiplied of Result of Sum and Subtraction (14*5=70)
- Divided the result of multiplication with 10 (70/10=7)
- Solved this series (100+200-100*2/5)

## Prerequisites:

- Install Android Studio latest version
- Install Appium Inspector
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME

## Allure Report:

![Screenshot (22)](https://user-images.githubusercontent.com/123433625/221787737-86cb2a17-622d-47fb-a52d-46834502bb80.png)


![Screenshot (23)](https://user-images.githubusercontent.com/123433625/221787758-f6d483c4-359b-4372-88cd-8f0d8c591501.png)

## Video Output:

https://user-images.githubusercontent.com/123433625/222357881-fc5ade76-607b-47d8-884d-cd7c4f4c6b6b.mp4



