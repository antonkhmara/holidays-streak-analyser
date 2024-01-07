# Coding Challenge

## Task Description

In this task, you are tasked with developing a feature for an employee leave management system. The system helps employees optimize their leave plans by identifying the longest sequence of holidays. This sequence can be extended with a minimal number of leave days to maximize their time off.
<br>
<br>
<img src="https://github.com/antonkhmara/holidays-streak-analyser/assets/61289635/5429c8ab-ee23-4e07-b4b2-95dd8b83d10b" alt="June_Holdiays" width="250" align="right">
### Example

If in June the holidays fall on the 7th, 24th, and 25th, then the longest sequence of holidays is from Saturday, June 22nd to Tuesday, June 25th. This sequence includes the weekend (Saturday and Sunday) followed by two public holidays on Monday and Tuesday.

<br>
<br>
<br>
<br>


## Key Functionalities to Implement

- **Data Input:**
  - Users should be able to invoke the endpoint via Postman/curl by passing parameters such as `countryCode`, `startDate`, and `endDate`.

- **Data Output:**
  - The system should return an array of dates representing the longest holiday sequence. If there is more than one sequence with the maximum length, the system should return the most recent one.
 
- **Holiday Sequence Calculation:**
  - The application should identify the longest sequence of consecutive holidays.
