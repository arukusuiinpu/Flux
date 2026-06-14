# 𓆝𓆟𓆞Flux𓆟𓆞𓆝
_Flexibility should always be an alternative! Flux is not an answer for your demands, but is a call for action._
# 𓆝𓆟𓆞____𓆟𓆞𓆝

## Mock plans:
- More useful operators and aliases (Python, C#)
- Native java variable type redeclarations (using scope dynamic score reorganization)
- Intent modifiers with compiler acknowledgement
- Compiler --fail-on unfinished or --warn-on suboptimal (intent modifiers)
- Walrus := operator
- Non-finalized or dynamic lambdas (-> for dynamic, => for static)
- Better generics (C# inspired; includes single function parametrization for 2+ types)
- Powerful annotation (dynamically derived values in interfaces for example)
- Provide built-in solutions for not implemented Java features (https://en.wikipedia.org/wiki/Comparison_of_C_Sharp_and_Java)
- Documentation
- Null safety
- Native JVM execution
- Realtime bytecode modifications
- Built-in mixin-like functionality
- C# realtime compilation and execution support

_Sorted based on plausibility of quick implementation and urgency._

## Example code (everything here works):
```
import java.lang.* // Inherits Java libraries and importing structure
using org.apfloat.Apfloat // Or you can use C# format if you want

float float1 = 1.0F // Java handles as float
float float2 = 1.0 // Same here

double double1 = 1.0 // Java handles as double
double double2 = 1.0d // Same here

String str1 = '\'string1\'' // Directly uses Java String type, boolean also works
string str2 = "\"string2\"" // The same type as before, just more consistent with built-ins

char char1 = 's' // Single symbol, technical or '' strings are treated as chars

bool bool1;

j = 0l;

var var1 = 1.0F // Handles value variables
var2 = 1.0F // Var is optional

var3 = varFunction1() // Also handles function variables

var4 = "hai"

private bool SampleFunction(float a, float b) { // Inherits modifiers from Java

    float c = float1 + float2; float d = 3.14 // Both ';' and '\n' serve as terminators

    float m1 = c ** d // Exponent operator
    float m2 = c /% d // Floor Division operator (aka // in python)
    float m3 = c %/ d // Ceil Division operator

    m1 **= 2
    m2 /%= 2 // These three work the same way as any regular operation assignments
    m3 %/= 2

    List<string> list1 = new ArrayList() {{ add("element1"); add("element2"); }} // Directly compiles in Java
    list2 = [1, 2, 3, 4, 5] // Borrows simpler list structure from python

    bool1 = c < d < 5 // Chained comparisons are supported

    foreach (var element in list1) { // Foreach works both in C# format
        print(element, 'C# foreach') // Custom System.out.println wrapper
    }

    for (element : list1) { // And Java format (':' and 'in' are interchangeable for both)
        print(element, 'Java foreach')
    }

    bool ternaryBool = False if list1.size() > list2.size() else True // Python ternary is supported

    return 1 < 2 < 5 ? ternaryBool : False // The more classic alternative too
}

def main() { // Optional python-style block and function syntax (def is the same as void)
    print(double1 *** double2); // Tetration, also can be done using ^^

    var test = SampleFunction(float1, float2)

    def voidDef(float voidFloat1, voidFloat2: float) { // You can combine python and java/C# syntax

    }

    i = 0

    string SampleString(string name) { // Allows nested functions
        return f"Hello, {name}! How are you today my little fella? The i is: {i}" // Fstrings
    }

    string sampleString = f"{SampleString("random user")}\ntest"

    print(sampleString)
}

var varFunction1() { // Flux also allows loosely typed functions, it inherits the type from the return statement, ex. int
    return 1
}

varFunction2() { // Function type will resolve into illegal if there are no returns, or any returns are of different types, this one is legal and is double
    if (bool1) {
        return [1.0 for i in range(1000)][0] // Python-style generators
    }
    else {
        [{ print(i) } for i in range(1000)] // We even have slightly more advanced than python generators in java

        return 1.0 + 1 // Handles auto promotion (double + int -> double)
    }
}

unfinished void unfinishedVoid() { // Flux also has a special comment function or variable modifier for unfinished parts of your code

    illegal float illegalFloat; // I think you can find a few places this could be useful in

    unpolished void unpolishedVoid() { print(5 *** 5) } // For when something you coded works fine, but could be rewritten by a more competent person
    suboptimal void suboptimalVoid() { for i in range(1000000) { print(i) } } // This could signal logic that works great at the expense of the execution time
    ugly void uglyVoid() { [x for x in range(100)][0] } // This one just begs to be rewritten because of how ugly you found it

}

exp1 = (float) 2 ** 3 ** 4 // Operations handled according to associativity from this list (ordered by the lexer precedence):
/*
(This will be moved to the documentation eventually)

    Tetration -> Right to Left
        expression *** expression

    Exponentiation -> Right to Left
        expression ** expression

    Array access -> Left to Right
        expression[expression]

    Variable access -> Left to Right
        expression.expression

    Lambda functions -> Right to Left
        lambda id...: expression
        (id...) -> or => expression

    Walrus operator -> Right to Left
        id := expression

    Casting -> Left to Right
        (type) expression

    Not operator -> Left to Right // Because not should behave like ! does, yet this might be changed in the future
        !expression
        not(expression)

    Multiplication/Division -> Left to Right
        expression * or / or % expression

    Floor Division -> Left to Right
        expression /% expression

    Ceil Division -> Left to Right
        expression %/ expression

    Addition/Subtraction -> Left to Right
        expression + or - expression

    Bit Shift operations -> Left to Right
        expression << or >> or >>> expression

    Comparisons -> Left to Right
        expression < or > or <= or >= expression
        expression instanceof expression

    Equality -> Left to Right
        expression == or != expression

    Bitwise operations -> Left to Right
        expression & or ^ or | expression

    Logical operations -> Left to Right
        expression && or and expression
        expression || or 'or' expression
*/
```
## 𓆝𓆟𓆞𓆟𓆞𓆝𓆟𓆞𓆝
Feel free to contribute if you want!
