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

## July 13th

### the SLList

1. a list of Integer, and hide inside. SLList acts like a middle man between user and raw data structure.
2. **private** *reflection* cannot use that attribute outside class. **public** type in java will not be removed.
3. **Nest Class** move class inside other classes, subordinate class.
   - nest class on the top.
   - nest class never use boss class resources, **static**.
   - prefer non-nesting and vertical layouts.
4. recurssive method need a helper method.
5. let object control everything. do not need method to calculate, but a natural way to get it.
6. Sentinel node：empty list also has s sentinel node.
7. double link list: sentinel front & sentinel back, or make the list circular
8. generic link list: public class SLList<userDefinedType> {}; 
   - Main method: SLList<String> L = new SLList<String>("bone");
   - when implementing data structure, specify "generic type" only once at the top.
   - when using data structure, write out desired type during declaration.
   - use empty diamond operator <> during instantiation. arbitrary placeholder .
   - use the reference type: Integer, Double, Character, String, Boolean, Long. not primitive type.

## July 14th

### Array

1. create an array, have default value 0, null.
2. string type store reference.
3. arraycopy method: System.rraycopy(Source array, start pos, Target array, start pos, Number to copy).
4. array and class have the same unchanged box.

### static

1. specific to a class, all the instances of the same class share the same variable.
2. instance has access to both the static and non-static method & variables.
3. static method & class not be allowed to access instance method & variable.
4. null object cannot access variable, do not make sense.

## July 15th

### test

1. deprecated: tolerated supported but not recommended.
2. Unit test vs Intergration Test.
3. focus on single task at one time.
4. code refactor, keep function will more readable, simple, efficient.
5. JUnit runner/renderer, delete main OK. 
6. Test philosophy: 
   - autograde workflow is slow and unsafe.
   - Unit test! write test for every piece of method.
7. Test-Driven Development *TDD*,

## July 19th

### lab2 (accomplished!)

1. Setup **intelliJ**
   1. according to the [setup guidance](https://sp21.datastructur.es/materials/lab/lab2setup/lab2setup), but in setting -> maven there is no "for new project", in the end, I open the project, and **File->project structure**, add the java jar in *javalib*.
   2. First open lab2, there is no source code, the open **project structure**, add the lab2 module, then the code appear.
   3. *erroe: Java language level is set to 5 which is not supported by the current Java version*, according to this [blog](https://www.cnblogs.com/KylinBlog/p/14147917.html), also need to **preference->java compiler**, set target byte code version equal to the maven pom/xml.
2. **Junit**:
   1. Import org.junit.Test; static org.junit.Assert.*
   2. assertEquals(expected, actual)
   3. all test must be non-static(???)
   4. JUnit tests are short-circuiting – as soon as one of the asserts in a method fails, it will output the failure and move on to the next test
3. **Debug**: nested function call: A(B(arg)), when step in, IntelliJ will ask which function show the detail, if chose A, B step over.
   - recommend refactor code: x = B(arg); y=A(x); when test bug over, change the refactor code to the one-line version.
4. Attention!  return BoolValue || RecurMethod(), the position is very important!
5. set up **win environment**, download git, sdk, intelliJ, using git bash, very flexible!

