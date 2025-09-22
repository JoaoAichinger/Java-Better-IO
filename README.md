# B_IO Library

A lightweight Java utility class for handling console input with
different data types.\
It simplifies reading values from the console using a unified interface
and customizable character encoding.

------------------------------------------------------------------------

## Features

-   Read input as:
    -   **Integers** (`int`)
    -   **Doubles** (`double`)
    -   **Floats** (`float`)
    -   **Longs** (`long`)
    -   **Shorts** (`short`)
    -   **Bytes** (`byte`)
    -   **Booleans** (`boolean`)
    -   **Strings** (`String`)
    -   **Characters** (`char`)
-   Support for **UTF-8** and customizable character sets.
-   Simple `print` method for output prompts.

------------------------------------------------------------------------

## Installation

Clone this repository and include the `B_IO.java` file in your Java
project:

``` bash
git clone https://github.com/your-username/b-io.git
```

Then, import the class into your project:

``` java
import com.jbio.io.B_IO;
```

------------------------------------------------------------------------

## Usage

### Create an instance

``` java
B_IO io = new B_IO(); // uses UTF-8 by default
```

Or specify a custom charset:

``` java
B_IO io = new B_IO("ISO-8859-1");
```

------------------------------------------------------------------------

## Methods Documentation

### Constructor

-   `B_IO()`\
    Creates an input reader using UTF-8 encoding.

-   `B_IO(String charSet)`\
    Creates an input reader using a specified charset (e.g.,
    `"ISO-8859-1"`).

------------------------------------------------------------------------

### Charset Control

-   `void setCharSet(String charSet)`\
    Sets the character set for input reading.

------------------------------------------------------------------------

### Reading Integers

-   `int readInt()`\
    Reads an integer from input.\
-   `int readInt(String prompt)`\
    Prints a message and then reads an integer.

------------------------------------------------------------------------

### Reading Doubles

-   `static double readDouble()`\
    Reads a double from input.\
-   `static double readDouble(String prompt)`\
    Prints a message and then reads a double.

------------------------------------------------------------------------

### Reading Floats

-   `static float readFloat()`\
    Reads a float from input.\
-   `static float readFloat(String prompt)`\
    Prints a message and then reads a float.

------------------------------------------------------------------------

### Reading Longs

-   `static long readLong()`\
    Reads a long from input.\
-   `static long readLong(String prompt)`\
    Prints a message and then reads a long.

------------------------------------------------------------------------

### Reading Shorts

-   `static short readShort()`\
    Reads a short from input.\
-   `static short readShort(String prompt)`\
    Prints a message and then reads a short.

------------------------------------------------------------------------

### Reading Bytes

-   `static byte readByte()`\
    Reads a byte from input.\
-   `static byte readByte(String prompt)`\
    Prints a message and then reads a byte.

------------------------------------------------------------------------

### Reading Booleans

-   `static boolean readBoolean()`\
    Reads a boolean (`true/false`) from input.\
-   `static boolean readBoolean(String prompt)`\
    Prints a message and then reads a boolean.

------------------------------------------------------------------------

### Reading Strings

-   `static String readString()`\
    Reads a string (entire line) from input.\
-   `static String readString(String prompt)`\
    Prints a message and then reads a string.

------------------------------------------------------------------------

### Reading Characters

-   `static char readChar()`\
    Reads the **first character** from input.\
-   `static char readChar(String prompt)`\
    Prints a message and then reads the first character.

------------------------------------------------------------------------

### Printing

-   `static void print(Object obj)`\
    Prints any object to the console.

------------------------------------------------------------------------

## Example Program

``` java
import com.jbio.io.B_IO;

public class Main {
    public static void main(String[] args) throws Exception {
        B_IO io = new B_IO();

        String name = io.readString("Enter your name: ");
        int age = io.readInt("Enter your age: ");
        char initial = io.readChar("Enter the first letter of your surname: ");

        B_IO.print("Hello, " + name + "! You are " + age + " years old and your surname starts with " + initial + ".");
    }
}
```

------------------------------------------------------------------------

## Requirements

-   **Java 8** or higher
-   No external dependencies

------------------------------------------------------------------------

## License

This project is licensed under the MIT License.\
<!--See the [LICENSE](LICENSE) file for details.-->
