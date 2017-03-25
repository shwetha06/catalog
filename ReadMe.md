Automation Project:

Framework Type: Hybrid with Page Factory Or PageObjectPattern/TestNG/ReportNG 

Application:
http://107.170.213.234/catalog/

    Assignment1: 
         Step1: Create test cases for Creating Account (~30 - 50 test cases). Repeat other features. Login, Buy products, search etc.
        Step2: Identify test cases for automation
        Step 3: Browser supported = FireFox, Chrome and IE
         Step4: Build a hybrid framework as we did in our class 
			Framework should includde 
					- Excel for test data, 
					- Proeprties files for Browser and URL, 
					-DB reader , 
					-Sceenshot Capture, 
					- ReportNG set up and 
					 - parameter from XML for different browser type execution, 
					- Log4J set up for logging
- Maven, Jenkins expandable
- Cucucmeber expandable
        Step5: Please remember do not keep test data in script. Please use excels.
        Step 6: Build the test scripts

Assignment2:
DB verification for CreateAnAccount:
Once you write a script for creating an account, please verify the info in DB

Execution: Run these test cases on three browsers, on daily basis. We can run the tests on jenkins server or commandline 
          
Defect Tracking Tool:
http://107.170.213.234/mantis/login_page.php
UserName= student
PWD =test123

Test Management Tool:
http://107.170.213.234/testlink/login.php

MySQL DB info:
Download MySQL and connect to the DB for manual testing and write a script in Selenium to connect DB thru code.
http://dev.mysql.com/downloads/tools/workbench/

Username=student
PWD =test123

MySqlDB Access:

Connection Method =SSH
SSH HostName= 107.170.213.234
Username= qatester
PWD= qatester

DB HostName=localhost
PORT number = 3306
Username =qatest
PWD=qatest



Folder Structure:
C:\\Selenium
        \libs – all project jar files
         \drivers – chrome and ie driver
          \workspace – this is used for eclipse workspace
