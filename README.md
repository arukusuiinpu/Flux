# 𓆝𓆟𓆞Flux𓆟𓆞𓆝
_As you can guess this is not a professional\
project by any means in this initial state._
# 𓆝𓆟𓆞____𓆟𓆞𓆝

## Mock plans:
- More useful operators and aliases (Python, C#)
- := operator
- Better generics (C# inspired; includes single function parametrization for 2+ types)
- Non-finalized or dynamic lambdas (-> for dynamic, => for static)
- Provide built-in solutions for not implemented Java features (https://en.wikipedia.org/wiki/Comparison_of_C_Sharp_and_Java)
- Powerful annotation (dynamically derived values in interfaces for example)
- Documentation
- A custom 'plug-and-code' Java compiler (via a built-in Maven)
- Native JVM execution
- Realtime bytecode modifications
- Built-in mixin-like functionality
- C# realtime compilation and execution support

_Sorted based on plausibility of quick implementation and urgency._

## Example code:
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

var var1 = 1.0F // Handles value variables
var2 = 1.0F // Var is optional

var3 = varFunction1() // Also handles function variables

private bool SampleFunction(float a, float b) { // Inherits modifiers from Java

    float c = float1 + float2; float d = 3.14 // Both ';' and '\n' serve as terminators

    float m1 = c ** d // Exponent operator
    float m2 = c /% d // Floor Division operator
    float m3 = c %/ d // Ceil Division operator

    m1 **= 2
    m2 /%= 2 // These three work the same way as any regular operation assignments
    m3 %/= 2

    List<string> list = new ArrayList() {{ add("element1"); add("element2"); }} // Directly compiles in Java

    bool1 = c < d < 5 // Chained comparisons are supported

    foreach (var element in list) { // Foreach works both in C# format
        Print(element, 'C# foreach') // Custom System.out.println wrapper
    }

    for (element : list) { // And Java format (':' and 'in' are interchangeable for both)
        Print(element, 'Java foreach')
    }

    return bool1
}

void main() {
    Print((double1 *** double2).doubleValue()); // Tetration

    var test = SampleFunction(float1, float2)

    string SampleString(string name) { // Allows nested functions
        return String.format("Hello, %s!", name)
    }

    string sampleString = SampleString("random user") + test

    Print(sampleString)
}

unfinished void unfinishedVoid() { // Flux also has a special comment function or variable modifier for unfinished parts of your code
    unfinished float unfinishedFloat;
    illegal float illegalFloat; // I think you can find a few places this could be useful in
}

var varFunction1() { // Flux also allows loosely typed functions, it inherits the type from the return statement, ex. int
    return 1
}

varFunction2() { // Function type will resolve into illegal if there are no returns, or any returns are of different types, this one is legal and is double
    if (bool1) {
        return 1.0
    }
    else {
        return 1.0
    }
}
```
## 𓆝𓆟𓆞𓆟𓆞𓆝𓆟𓆞𓆝
Feel free to contribute if you want!
