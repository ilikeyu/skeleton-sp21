## This is my CS61b project

- I create my own branch
- Maybe I will push my dairy here



## July 10th

1. accomplish lab1 and HW0
2. install IntelliJ IDE and set up the environment, also familiar with its basic operation
3. learn how to use git ton control local&remote repository.
   1. git add / comment / push /pull
   2. get remote add / rename / rm
   3. git status / checkout
4. Can not use Gradescope to auto grade. what a pity!
5. would like to learn more operation about **gi**t in the future, such as how to restore, etc.



## July 11th

### defining & using classes

1. instance variable; constructor, non static method, a.k.a instance method
2. Declaration, instantiation and assignment.
3. static variable(members), access using class name
4. public static void main(String[] args)
   - Args string convert to int: int foo = Integer.parseln(arg[0]);
5. using libraries : built-in java libraries; Princeton std lib
6. accomplish homework largerThanFourNeighbors

### Primitive type & reference type

1. 8 primitive types; int 32bits, double 64bits.
2. GRoE: Golden Rule of Equal, how equal works: copy the bits.
3. Address 64bits, **new** method return an address; null make all 64bits Zero.
   - Undefined != null; 
4. parameter passing: pass the value, always copy the bits
5. address is shout by **new** and falls on deaf ears: assignment, if no assignment, address is lost, then will be recycled by garbage collector. constructor returns
6. Intlist, arbitrarily large, not a fix size.
   - a method using **Recursion** to get list size; or **Iterative**

### the SLList

1. a list of Integer, and hide inside. SLList acts like a middle man between user and raw data structure.
2. **private** *reflection* cannot use that attribute outside class.
3. **Nest Class** move class inside other classes.