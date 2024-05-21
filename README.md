# Student Marks Report System

This Java application is designed to calculate and display a student's marks report based on their performance in various components of their academic year. The system takes into account the student's test result, assignment result, and exam result, applying specific weights to each component to determine the final grade percentage.

## Overview

The application consists of two classes: `Student` and `Student_Report`. The `Student` class serves as the base class, storing the student's identification number and their results for the test, assignment, and exam. The `Student_Report` class extends `Student`, overriding methods to apply weightings to the results and calculating the overall report score.

## Key Components

- **Student Class**: Represents a student with attributes for the student number and results for the test, assignment, and exam.
- **Student_Report Class**: Inherits from `Student`, applies weightings to the results, and calculates the overall report score.
- **User Input Handling**: The application uses `JOptionPane` for user interaction, prompting for student details and validating inputs.
- **Error Handling**: Includes checks for valid student numbers and result ranges, guiding the user to correct entries.

## Usage

1. Run the `studentMarksReport` class.
2. Enter the student's five-digit student number.
3. Input the student's test result, assignment result, and exam result, each out of 100.
4. The application calculates the weighted average of these scores to produce the final report score.

## Example Output

The output displays the student's number alongside their individual mark types, their respective weights, and the calculated marks. It concludes with the total year mark percentage.

## Contribution

Contributions to improve the system, add new features, or fix bugs are welcome. Please submit pull requests for review.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].