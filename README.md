What is Assembler ?
An assembler is a computer program that convert programs written in assembly language into machine language


Describe One & Two Pass Assembler
A single pass assembler scans the program only once and creates the equivalent binary program
A two pass assembler does two passes over the source file. In the first pass all it does is looks for label definitions and introduces them in the symbol table.
In the second pass, after the symbol table is complete, it does the actual assembly by translating the operations into machine codes and so on


List Data Structure For Pass 1 Assembler
OPTAB (Operator code Table) - This is used to look up mnemonic operation codes and translate them into equivalent machine
SYMTAB (Symbol Table) -  This is used to store addresses assigned to labels
LOCCTR (Location Counter) - This is used for assignment of addresses.


Explain Source Code , Object Code , Machine Code & Intermediate Code
Source code is human written code written in any programming language. Source code is the set of instructions and statements written by a programmer using a computer programming language

Object code is a portion of machine code that has not yet been linked into a complete program

Machine code is any low-level programming language, consisting of machine language instructions

Intermediate code is used to translate the source code into the machine code



What is Literal Table ?
Literal table is used for keeping track of literals that are encountered in the programs. Literal table contains all literals and address of all literals


What is Relocatable code
Program code that can be loaded anywhere in memory


What is Table of incomplete instruction ? (TII)
A table of instruction containing forward references is maintained separately called table of incomplete instruction (TII).

What is Pool Table ?
Awareness of different literal pools is maintained using the auxiliary table POOLTAB

What is DLL ?
DLL (Dynamic Link Library) is a collection of small program that large program can load when needed to perform specific task. Its extension is .dll

How to create dll file in windows operating system ?
There are many ways to create dll files. I am stating one way :
By using Visual Studio (Not Visual Studio Code) We Can Create dll Files Using.NET Language (C# or VB.NET)

What is Linker ?
Linker is a program that takes one or more object files & combines them into sing executable file (.exe file) or library (.dll)

What is Loader ?
Loader is a part of operating system which is responsible for loading programs & library

Compare Linker & Loader
Linker	Loader
Linker is used to generate executable files (.exe file)
Loader is used to load exe file (executable file) into main memory
Linker is used to combine all the object modules	Loader is used to allocate address for exe file


Difference between Static & Dynamic Linking
Static linking copies all library modules used in the program into the final executable file at the final step of the compilation while, in Dynamic linking, 
the linking occurs at run time when both executable files and libraries are placed in the memory

What is Translator ?
A translator is a program that converts source code into object code

What is Relocation ?
Relocation is the process of modifying the address used by program such that program can execute correctly

What is Binding ?
Binding refers to the link that is created between method call and method definition

State type of binding
Static & dynamic binding

Difference between static & dynamic binding
The binding which can be resolved at compile time by compiler is known as static binding. It is also called as early binding

In Dynamic binding compiler doesn’t decide the method to be called

What is Burst Time ?
Burst time is the amount of time required by a process for executing on CPU.

What is Waiting Time ?
Waiting time is the total time spent by the process in the ready state waiting for CPU.

What is Turn Around Time ?
Turnaround time (TAT) is the time interval from the time of submission of a process to the time of the completion of the process

What is Quantum Time ?
The period of time for which a process is allowed to run in a preemptive multitasking system is generally called the time slice or quantum

What is Response Time ?
Response time is the time spent when the process is in the ready state and gets the CPU for the first time

What is Service Time ?
The amount of CPU time that a process will need before it either finishes or voluntarily exits the CPU, such as to wait for input / output.

What is Throughput ?
The number of processes that are completed per time unit.

What is Arrival Time ?
Arrival time is the time when a process enters into the ready state and is ready for its execution.

What is Process & Thread ?
Process is a program in execution.

A thread is a single sequential flow of execution of tasks of a process so it is also known as thread of execution or thread of control.

What is Swapping ?
Swapping is a mechanism in which a process can be swapped temporarily out of main memory (or move) to secondary storage (disk) and make that memory available to other processes.

What is Paging ?
Paging is a memory management scheme that eliminates the need for contiguous allocation of physical memory

What is opcode ?
The opcode is the instruction that is executed by the CPU

What is Starvation ?
Starvation is the problem that occurs when high priority processes keep executing and low priority processes get blocked for indefinite time

What is Convoy Effect ?
Convoy Effect is a problem in which the whole Operating System slows down due to few slow processes.

What is Preemptive & Non-Preemptive Algorithm ?
Preemptive	Non-Preemptive
Resources are allocated to process for limited time	Resources are allocated until the process completes
Process can be interrupted in between
Process can not be interrupted in between
Flexible. Ex : RR , SRJF	Rigid. EX : FCFS,SJF

What is FCFS ?
First in, first out (FIFO), also known as first come, first served (FCFS), is the simplest scheduling algorithm

What is FIFO ?
FIFO full form is first in, first out. It is a method for handling data structures where the first element is processed first and the newest element is processed last.

What is SJF ?
Shortest Job First (SJF) is an algorithm in which the process having the smallest execution time is chosen for the next execution.
 This scheduling method can be both preemptive or non-preemptive.

What is SRTF ?
The shortest remaining time First (SRTF) algorithm is preemptive version of SJF. In this algorithm, 
the scheduler always chooses the processes that have the shortest expected remaining process time.

What is Round Robin ?
Round Robin is a CPU scheduling algorithm where each process is assigned a fixed time slot in a cyclic way

What is LRU ?
It is known as Least Recently Used : In this algorithm, OS replaces the page that will not be used for the longest period of time in future

What is Priority Scheduling ?
Priority Scheduling is a method of scheduling processes that is based on priority. In this algorithm, the scheduler selects the tasks to work as per the priority.

What is Page Replacement Algorithm ?
Page Replacement Algorithm decides which page to remove, also called swap out when a new page needs to be loaded into the main memory

What is Long & Short Term Scheduler ?
A long-term scheduler determines which programs are admitted to the system for processing.

The short-term scheduler (also known as the CPU scheduler) decides which of the ready, in-memory processes is to be executed (allocated a CPU) after a clock interrupt

What is Preemption ?
In computing, preemption is the act of temporarily interrupting a task being carried out by a computer system

What is Page Fault ?
When page referred by cpu is not found in the memory then the situation is known as Page Fault.

What is Page Hit ?
When we want to load the page in the memory & that page is already available in the memory then it is termed as Page Hit.

What is Page Size ?
It is the size of page which is determined by system architecture.



