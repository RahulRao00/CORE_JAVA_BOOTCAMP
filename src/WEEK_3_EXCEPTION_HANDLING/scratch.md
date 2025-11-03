
##  Exception Handling   ##
  -> An exception is a runtime error that disrupts the normal flow of a Java program, 
       It is an object that the Java runtime creates and throws when an error occurs.
  
## TYPE Of Exceptions  ## 
        -> Checked Ecxception 
        -> Unchecked Excaption 
        -> Errors   -> Serious issues like memory leaks or JVM crashes (eg. OutOfMemoryError)

## Hierarchy of Exception  ##

java.lang
|-Object
└── Throwable
├── Exception
│    ├── IOException (checked) -> by compile at compile time 
│    ├── SQLException (checked)
│    └── RuntimeException (unchecked) -> compiler cant handle these -> occur at the runtime -> at execution time 
│         ├── NullPointerException
│         ├── ArithmeticException
│         └── ArrayIndexOutOfBoundsException
└── Error
└── OutOfMemoryError, StackOverflowError,
 


## Checked Exception ##
    -> A checked exception is an exception that is checked (notified) by the compiler at compilation-time,
        these are also called as compile time exceptions. eg -> Try to access file but, due to wrong path exception occurs at complile time 
    -> Checked at compile-time, Must be handled using try-catch or throws.


## Unchecked Exception -> 
    -> An exception that occurs at the time of execution.These are also called as Runtime Exceptions. 
       These include -> such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
        -> eg. declared an array of size 5, and trying to call the 6th element then an ArrayIndexOutOfBoundsExceptionexception occurs.


## ERRORS ##  
    -> These are not exceptions at all, but problems that arise beyond the control of the user or the programmer.

