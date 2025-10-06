

## Q1)
The Java swing framework is a GUI (graphical user interface) for Java that is part of its standard library. The GUI toolkit has a collection of built in components like labels, tables, buttons, panels, containers etc. It also uses the MVC architectural pattern, which separates information (model), presentation (view), and user interaction (controller). This swing framework is used for many different purposes, the main one being building desktop applications and making it easier for programmers to design interfaces that are independent, reliable and reusable. 

Class diagram of swing componenets: <img width="1236" height="600" alt="image" src="https://github.com/user-attachments/assets/240ac710-b0ee-4595-9a64-f971be695939" />

## Q2)
In Github, there are three codes that implement the MVC pattern which are Model.java, Controller.java, and View.java. In the example code in the Github, the Model.java stores the data such as first and last name and also uses getter and setter methods like getFirstName () and setFirstName() and separates the data from how it's displayed. The view code builds the interface using the swing framework and uses components such as buttons, frame, textfield etc. The view code is not responsible for what the elements are/should be doing but only how it’s displayed. It also has getter methods so the Controller can access the elements and put them into the view. Finally, the Controller code connects the view and model codes by getting the user input from the View and also updates the model with new data. All of this supports the main objective of MVC pattern described in lecture which is to separate information, presentation, and user interaction.

There are a few differences in how the codes implement the MVC then the conventional MVC pattern shown in lecture. In the lecture version, the View gets data directly from the Model and displays it, but in the GitHub code the Controller gets the data from the Model and passes it into the View using (initView()). Another difference is in the lecture version, once the Controller updates the Model, the Model sends a notification to Views and Controllers (Observer pattern) so that it update automatically itself. In the GitHub example, there is no notification implemented so updates to the View are not automatic and instead have to be manually triggered by the Controller. 

## Q4)
Sequence Diagram: <img width="1052" height="1164" alt="image" src="https://github.com/user-attachments/assets/63a6b045-4ec6-49f0-91f5-bab2ac4fcdfe" />
