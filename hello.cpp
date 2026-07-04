#include <iostream>
using namespace std;

int main() {
    // Declare variables to store integers
    int firstNumber, secondNumber, sum;
    
    cout << "Enter the first number: ";
    cin >> firstNumber; // Takes user input
    
    cout << "Enter the second number: ";
    cin >> secondNumber;
    
    // Perform arithmetic addition
    sum = firstNumber + secondNumber;
    
    // Display the final result
    cout << "The sum of " << firstNumber << " and " << secondNumber << " is: " << sum << endl;
    
    return 0; // Signals successful execution
}
