# MockingAssignment
Homework #6 for CPTR245

Authors: Ethan Beaver, Nick Perry

##Steps to Run

* Ensure that JUnit4 is added to the class path of the project.

* Ensure that Mockito is added to the runtime environment
  * To do this IntelliJ IDEA, go to File -> Settings -> Project Structure.
  * Select Global Libraries in the left hand bar and press the plus to add a new library.
  * Search for Mockito and install mockito-all-1.10.19.jar, adding it to the current project.

## Process

### Step 1: Mocking Framework Decision

In looking at the different mocking frameworks offered in this assignment, we decided on Mockito
because it was the most widely-adopted framework, and the documentation and community
appeared to be better developed than the competitors

### Step 2: Learning syntax

After getting the framework installed, we had to learn the syntax to use.
From the studies in class, we knew the conceptual idea of what we had to do, but
we had to learn how to do that in Mockito. This included learning how to mock classes and
interfaces, mocking functions, and verify the number of times a mocked function was called.

### Step 3: Actually implementing mocks into JUnit tests
Implementing 