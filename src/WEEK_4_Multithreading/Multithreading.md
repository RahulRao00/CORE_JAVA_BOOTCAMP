
##  Multithreading ##

-> A thread is a lightweight, independent unit of execution inside a program (process).
     -> A process can have multiple threads.
     -> Each thread runs independently but shares the same memory.

## Execution  ##
A Class extends Thread and override its run() method to define the task. 
Then, we make an object of this class and call start(),-> jvm automatically calls run() and begins the thread’s execution.
We wrote all the code to be executed in the overridden method 

## Implementing the Runnable Interface
create a new class which implements java.lang.Runnable interface and override the run() method in it .
Then we instantiate a Thread object and call start() method through this object

-> A thread has a lifecycle, and once it has started and finished its execution, it cannot be restarted or reused.

# if a class allRead extending the another class then we can't extend the Thread class in it due to(multiple inheritance) 
 -> Now in the case we have only option to Implement Runnable interface 

### Thread LifeCycle ###
    -> NEW STATE    -> when we create the boject of the threaded class so the thred is in new state 
    -> RUNNABLE STATE  -> calling the start() method with the help of that method 
    -> RUNNING STATE   -> either thread will be in the running of in the runnable state ts cpu related 
    -> WAITING STATE   -> if a thread is calling or waiting for the other thread to be executed 
    -> TERMINATED STATE  -> thread completed 

run() -> overridden method by the implemented class 
start() -> jvm call the overridden run() of the thread  
sleep() -> thread will sleep/wait 
join() -> through this main method will wait until the thread will complete 
setPriority() -> 


