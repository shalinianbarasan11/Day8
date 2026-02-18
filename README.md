### 1. What is the difference between Error and Exception?
Errors : Generally unrecoverable in your code think running out of memory or the JVM crashing stuff way beyond what your program can control or fix.
Exception: Exception handling lets you catch and handle errors during runtime.
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
Checked Exceptions: Must be declared in the method signature or handled with try-catch (eg: IOException).
Unchecked Exceptions: Do not require explicit handling (eg: NullPointerException).

