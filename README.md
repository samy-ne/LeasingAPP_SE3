
## Project Overview
This repository contains the source code for a Car Leasing System designed for a vehicle leasing store. The system is structured to manage and facilitate the process of leasing cars to clients efficiently, handling everything from vehicle addition, user registration, and login processes to managing active leases.

## Features
- **User Authentication:** Secure login and registration systems for clients and admins.
- **Vehicle Management:** Add, remove, and view vehicles available for lease.
- **Lease Contracts:** Manage leasing contracts with comprehensive details.
- **Client Management:** Track and manage client information and their leasing contracts.
- **Admin and Client Interfaces:** Dedicated interfaces for admins and clients with appropriate functionalities.

## File Structure
Below is an outline of the key Java files included in this repository:

1. **User Interfaces:**
   - `AddVehiclePage.java`, `AddVehiclePageNew.java` - Interfaces for adding new vehicles to the system.
   - `AdminMainPage.java`, `ClientMainPage.java`, `WorkerMainPage.java` - Main pages for different user roles.
   - `LoginPage.java`, `SignUpPage.java`, `StartPage.java` - For user authentication and navigation.

2. **Core Functionality:**
   - `Admin.java`, `Client.java`, `Person.java` - Defines properties and methods for user roles.
   - `Cars.java`, `Motorcycle.java`, `Vehicles.java` - Vehicle-related classes.
   - `Contract.java`, `DisplayContracts.java`, `ListOfClientsPage.java` - Manage contracts and client relations.

3. **Utility Classes:**
   - `Attributes.java`, `UserInfo.java` - Classes for handling various attributes and user information.
   - `OptionPaneExample.java` - Utility class for GUI dialog boxes.

4. **Miscellaneous:**
   - `CompareClass.java`, `CompareClass$NextContractComparator.class` - For sorting and comparison operations.
   - `Main.java` - The main class that runs the application.
   - `MyFrame.java`, `MyFrame$1.class`, `MyFrame.class` - Framework for the application's main window.

5. **Resources:**
   - `hyundai-sonata-2013.png` - An image resource used within the application.

## Getting Started
To get a local copy up and running follow these simple steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourgithubusername/car-leasing-system.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd car-leasing-system
   ```

3. **Compile the Java files:**
   ```bash
   javac *.java
   ```

4. **Run the application:**
   ```bash
   java Main
   ```

## Prerequisites
This project requires Java JDK to be installed on your machine. You can download it from [Oracle's Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
