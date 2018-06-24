# PokemonChallenge

Challenge for Premium Minds Internship

## Run through the command line

### Compile project

Run the following command in the root directory of the project.

```java
/> javac -d bin src/main/java/app/*
```

### Run application

Run the following command in the bin directory of the project.

```java
/bin> java app.Main NS
```

## Limitations

A Position is represented as a (x, y) axis of int values, which represent a limitation of -2147483648 to 2147483647, instead of an infinite board. To increase the amount of positions it would be reccomended the use of long types to represent each position.

## Considerations

The Movements representation could be an Enum type. It would ease the verification of a valid Movement (through the use of a for-loop to check the occurrence of a movement inside the Enum). However the change of the list of Movements is unlikely to happen and really short.