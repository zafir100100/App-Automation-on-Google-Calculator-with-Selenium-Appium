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
```json 
{
  "unicodeKeyboard": false,
  "resetKeyboard": false,
  "platformName": "android",
  "autoLaunch": "false",
  "fullReset": "false",
  "newCommandTimeout": 6000,
  "automationName": "UiAutomator2",
  "platformVersion": "10",
  "deviceName": "Redmi K20 Pro",
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator",
  "app": "D:\\files\\assignment\\final\\App-Automation-on-Google-Calculator-with-Selenium-Appium\\src\\test\\resources\\Calculator.apk"
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

## Prerequisites:

- Install Android Studio latest version
- Install Appium Inspector
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME

## Screenshots - Gradle Report:

- Gradle report screenshots are in: src/test/resources/screenshots/gradle-report

## Screenshots - Allure Report:

- Allure report screenshots are in: src/test/resources/screenshots/allure-report




