# Fermat's Last Theorem Near Misses Finder

## Description
Java-based program designed to find "near misses" for **Fermat's Last Theorem**. Fermat's Last Theorem states that there are no three positive integers \( x, y, z \) that can satisfy the equation:

\[
x^n + y^n = z^n
\]

for any integer value of \( n \) greater than 2. The program searches for values of \( x \), \( y \), and \( z \) that minimize the relative miss for the equation \( x^n + y^n \neq z^n \).

## How to Run the Program

### Prerequisites:
- Java (version 8 or higher)
- Visual Studio Code (optional, but recommended for editing and running the program)

### Installation:

1. **Clone this repository** to your local machine:
   ```bash
   git clone https://github.com/Pretzels14/FermatsNearMisses.git
  
2.  **Then Go to the project directory, and compile the program and run it**
  ```bash
  javac com/fermat/FermatsNearMisses.java
```
```bash
java com.fermat.FermatsNearMisses
```

# Usage of Program
### It will prompt the user to enter a variable n which is the power, using any nunber between 3 and 11. Then, it will ask the user to enter an uper boundary k which is any number >= 10
It will then search for near misses by going through the combinations of numbers within the range of 10 and k and output the best near miss and then then finally the smallest relative miss
