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
7. **double link list**: sentinel front & sentinel back, or make the list circular
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
3. arraycopy method: System.arraycopy(Source array, start pos, Target array, start pos, Number to copy).
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
   1. Import org.junit.Test; **static org.junit.Assert.**
   2. assertEquals(expected, actual)
   3. all test must be non-static(???)
   4. JUnit tests are short-circuiting – as soon as one of the asserts in a method fails, it will output the failure and move on to the next test
3. **Debug**: nested function call: A(B(arg)), when step in, IntelliJ will ask which function show the detail, if chose A, B step over.
   - recommend refactor code: x = B(arg); y=A(x); when test bug over, change the refactor code to the one-line version.
4. Attention!  return BoolValue || RecurMethod(), the position is very important!
5. set up **win environment**, download git, sdk, intelliJ, using git bash, very flexible!

## July 20th

### project0.

2. MVC *Model-View-Controller* Pattern, **Observer** Mode
3. emptySpaceExists: iterate the whole list and make sure every Tile class is not null.
4. maxTileExist: iterate list and find whether one value equals MAX_PIECE.
5. atLeastOneMoveExists: one situation exists empty space, and the other when the list is full, iterate the list and check whether every tile equals its right and down tile value.
6. try to understand what the side mean.

## July 21st

###  project0

1. using a helper method, consider every column one by one. 
2. Still cannot understand what the Side class mean, some linear algebra needed.
3. 2048 Game still have bugs, one obvious is that new tile occurs even there is already a tile.
4. big rain yesterday evening and today afternoon.

### Array list

1. resizing arrays: System.arraycopy(origin, startPoint, destination, startPoint, length)  --->  mutiply a specific **factor**, instead of plus a number.
2. **usage rate** = size / item.length.
3. Generic Item Array: cannot be instantiated --->new GenType[] : (GenType[]) new Object[], ccause a complier warning, just ignore it.
4. Stop **loitering**: nulling out items, otherwise its address stored in the array can consume a lot space.

## Inheritance-implementation

1. **overloading**: same name method using different types of parameter.
2. **overriding**
   1. Interface **Hyper**<GeneType>{}, show what hypernym could do (only method names); 
   2. class **Hypo**<GeneType> implements **Hyper**<GeneType>{values, methods}, write your method for each hyponym class in detail.
   3. subclass(hypo class) override the method; we can only say a method is overloaded.
   4. have to override all the methods! otherwose will fail to compile.
   5. @override: 
      1. only a marker; have eact the same signature (parameter type).
      2. catch typos, make sure subclass method name exact correspond to interface method.
   6. default method.
   7. Hyper<PrimitiveType> Item = **new** Hypo<PrimitiveType>();
      1. item type will be the Hypo class type.
      2. **Dynamic Type Selection** compile-time type *static type*, during declaration; Run-time type *dynamic type*, during Instantiation. when Dynamic override Static, then **Dynamic** type is uesd instead.
   8. "Is-a" relationship.
