# `example2`
where we discuss how one can maintain a list of Pokémon

## Pokémons and the Need for User-Defined Types

If you are familar with [Pokémon Go](http://www.Pokémongo.com/en-ca/) then you know that a significant aspect of game play involves keeping track of the Pokémon a trainer has caught (and not released).

Let us suppose that we wanted to keep track of only a few details for each Pokémon: name (Pokémon type, by default), Pokémon number (in the [Pokédex](http://Pokémondb.net/pokedex)) combat power and hit points.

We could do this in C in a few ways. Someone who did not know just a little bit of the C language could use an array for each of these Pokémon attributes: 

* an array for the names;
* an array for the Pokémon number;
* an array for the combat power;
* an array for the hit points.

In C, we could declare these arrays as follows:

```c
char    name[MAX_POKEMON][MAX_NAME_LENGTH];
int     number[MAX_POKEMON];
int     cp[MAX_POKEMON];
int     hp[MAX_POKEMON];
```

Presumably, we would use the `i`-th index of each array to refer to the appropriate attribute for the `i`-th Pokémon in some trainer's collection.

The use of a separate array for each attribute is a modeling choice. The use of four different arrays may be confusing to someone who is not familiar with a program that uses this modeling approach unless the code is well-documented. Even when the code is well documented, it is possible to make mistakes: if we had to write a method to *power-up* a Pokémon then we may update the combat power but not the hit points. In C, a solution to the problem of using different arrays is to use a language construct called [`struct`](https://en.wikipedia.org/wiki/Struct_(C_programming_language). A `struct` allows one to group multiple elements into one data type.

We would define a Polémon `struct` as follows:
```c
struct pokemon {
    char    name[MAX_NAME_LENGTH];
    int     number;
    int     cp;
    int     hp;
}
```

We can then define an array of Pokémon thus:

```c
struct pokemon pokemonArray[MAX_POKEMON];
```

At this point it may be good to remind ourselves that we are assuming a trainer can only have a pre-defined `MAX_POKEMON` number of Pokémons. We would like to relax this assumption at a later stage.

Using `struct`s allows us to group related data in a more meaningful fashion. To retrieve the combat power of the `i`-th Pokémon in `pokemonArray`, we would use `pokemonArray[i].cp`.