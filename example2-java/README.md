## Understanding `Pokemon.java`

We start with two `import` statements:

```java
import java.util.List;
import java.util.ArrayList;
```

These statememts include *standard* Java libraries. These are similar the `#include` statements in C.

We then start by defining a `Pokemon` in the block that begins with 

```java
public class Pokemon {
```

We are defining a Java `class` and that is somewhat similar to a C `struct`, except that we also have some methods (functions) in the class. One method is `power_up()` and the other is a special method called a *constructor* with the name that is identical to the name of the class, which is `Pokemon`. 

The constructor `Pokemon(String pName, int pNumber, int pCombat_Power, int pHealth_Points)` creates an object of the class `Pokemon`. The declaration `Pokemon pokemon1;` only tells the Java compiler that `pokemon1` can refer to an object of class `Pokemon` but no object has been created yet. We create the object using the keyword `new` and invoking the constructor that creates the object and then assigns `pokemon1` as a reference to that object.

Also notice that we create an `ArrayList<Pokemon>`, which is a datatype that can hold references to objects of class `Pokemon`. An `ArrayList` is like a C array except that it can grow in size and has some other methods associated with it.

In this example, we have used a special type of `for` loop that iterates over all elements in the `ArrayList`. 

We also call the `power_up` method on a specific `Pokemon`, `pokemon1` using the syntax `pokemon1.power_up();`. This is similar to the C call `power_up2(&pokemonArray[0]);`. In a sense, in the Java version, we do not pass the pokemon we are powering up as an argument to the function call; that is implicit when we say `pokemon1.power_up()`.

Compare the C and Java versions to get some understanding of how Java programs are written.