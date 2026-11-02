# Animal Shelter Management System 🐾

A robust, interactive Java console application that allows users to manage and interact with an animal shelter. Built with Object-Oriented Programming (OOP) principles, this application features secure password protection for individual pets, dynamic lists, and strict input validation.

## 🚀 Features

- **Dynamic Pet Registration:** Add new Cats or Dogs to the shelter, assigning them a custom name, color, age, specific diet, and a unique password.
- **Secure Editing System:** Edit pet traits (Name, Color, Diet, Age) continuously through a looping menu. Requires the pet's specific password to access.
- **Interactive Pet Care:** 
  - **Feeding:** Feed your pet! The program checks if the food matches the pet's specific diet (case-insensitive) before they eat.
  - **Talking:** Listen to your pet's unique sound (Meow/Woof) using overridden methods.
- **Robust Input Validation:**
  - `try-catch` blocks prevent crashes from invalid data types (e.g., typing letters instead of numbers).
  - Index bounds checking prevents errors when searching for non-existent animals.
  - Safe scanner buffer management prevents skipped input prompts.
  - A universal "Type 0 to quit" feature allows the user to safely back out of almost any menu prompt.

## 🛠️ Technical Concepts Used

- **Object-Oriented Programming (OOP):** Utilizes Abstract classes (`Animal`) and Inheritance (`Cat`, `Dog`).
- **Polymorphism:** Method overriding for specific animal behaviors (`eat()`, `sound()`).
- **Data Structures:** `ArrayList` for dynamic storage of animal objects and passwords.
- **Error Handling:** `try-catch` blocks and loop-based validation logic.
- **String Manipulation:** Case-insensitive string comparisons (`equalsIgnoreCase`).

## 💻 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Installation & Execution
1. Clone the repository or download the source files.
2. Open your terminal or command prompt and navigate to the folder containing the files.
3. Compile the Java files:
   ```bash
   javac AnimalShelter/*.java
   ```
4. Run the main program:
   ```bash
   java AnimalShelter.main
   ```

## 📖 How to Use

When you launch the application, you will be greeted with the main menu:

1. **Input new pet:** Choose between a Cat or Dog. Set a secure password, then define their traits. The system will give you their ID number.
2. **Edit pet:** Enter the pet's ID number and password. You can continually update their name, color, diet, or age until you choose to exit.
3. **Interact with pets:** Enter the pet's ID and password. Choose to either feed them (you must feed them their exact diet correctly!) or talk to them to hear them speak.
4. **Exit:** Type `0` at the main menu to close the application.

*Note: At almost any prompt in the application, you can type `0` to safely cancel your current action and return to the previous menu.*
