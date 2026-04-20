# Good, Bad, and Ugly (GBU) Reflection

**Author:** Sanyam Sood  
**Project:** Java OOP Calculator App

## The Good
The implementation of the multi-layered inheritance hierarchy was a highlight of this project. By starting with a basic interface and progressively adding functionality through `Calculator`, `MemoryCalc`, and finally `AdvanceCalc`, the codebase remains modular and easy to understand. The use of Java Generics (`<N extends Number>`) was particularly effective, as it allows the calculator to be used with various numeric types while maintaining type safety. Additionally, the formatted output using `printf` provides a professional user experience that mimics a real-world ledger.

## The Bad
One challenge faced during development was managing the state of the calculator during complex operations, especially when transitioning between basic arithmetic and advanced functions like square root. Ensuring that the `previousValue`, `inputValue`, and `operator` fields were updated in the correct sequence for the display logic required careful debugging. Initially, the square root operation did not align perfectly with the ledger format, which required a specific override in the `updateDisplay` method to handle the unary nature of the operation compared to binary arithmetic.

## The Ugly
The "ugly" part of the process was handling the edge cases for user input and mathematical constraints. For instance, implementing robust divide-by-zero protection and ensuring that square roots of negative numbers are handled gracefully involved adding multiple conditional checks that can clutter the core logic. Furthermore, syncing the display precision across all derived classes required a centralized approach in the base class, which felt slightly rigid when specific subclasses needed different display behaviors. In future iterations, a more flexible "Formatter" strategy pattern might be used to decouple the display logic from the mathematical operations.

## Conclusion
Overall, this project was a valuable exercise in applying Object-Oriented principles to a practical problem. It reinforced the importance of planning the class hierarchy before coding and demonstrated how inheritance can be used to build complex systems from simple, reusable components.
