# Phase 3 End Project - Create a Task Manager -- HCL ASSESSMENT

## Description
Create a task manager application with spring boot and spring Data JPA.
Background of Problem Statement:
The application will have UI in JSP.
At least 4 JSP Pages -> create task, display tasks, delete tasks, and update task.
Likely additional pages for login / registration, plus welcome page.

## Steps
1. Launch backend (make sure to have mysql installed with a databse caled 'taskmanagerhcl') by running the file TaskManagerApplication.java within the src/main/java/org/hcl/taskmanager folder
2. Go to the github repo: 'https://github.com/alinan-vn/task-manager-hcl-phase-end-frontend' and clone that repo. This is the fronted of this application.
3. Launch a live server on the index.html file within the html folder. live server on port 5500, go to 'http://127.0.0.1:5500/html/index.html'
4. Log in or register an account. Add a task by filling the task form that pops up after you properly register. All your new tasks will also render.

## Requirements
- Project must be well organized in packages.
- Usage of DAO, DaoIMPL, Service, Entity, and custom exception handling
- All data must persist in the database. (User information should also be stored in database)
- User must be logged in before adding or seeing the tasks. (spring boot security is acceptable but not mandatory.)
- User must get registered, to perform the login.
- User must implement swagger to generate the docs and UI. (use the provided springfox module) Not Required
- Application RESTful API between UI and business logic is optional but not required. Not Required
- Either monolithic or microservice based architecture is acceptable.
- Important fields of this application:
    - Task name (text box)
    - Start date (date picker)
    - End date (date picker)
    - Description (text area)
    - Email (text box)
    - Severity (drop down) (High, medium, low)
    - User (tasks should belong to a user)