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
- ~~Inherited libraries (built-in or 'no import' libraries are defined using metadata)~~
- Powerful annotation (dynamically derived values in interfaces for example)
- A custom 'plug-and-code' Java compiler (via a built-in Maven)
- Native JVM execution
- Realtime bytecode modifications
- Built-in mixin-like functionality
- C# realtime compilation and execution support

_Sorted based on plausibility of quick implementation and urgency._

## Example code:
```
import java.lang.* // Inherits Java libraries and importing structure

float i = 1.0F // Java handles as float
float j = 1.0 // Same here

double k = 1.0 // Java handles as double
double m = 1.0d // Same here

bool test;

private bool SampleFunction(float a, float b) { // Inherits modifiers from Java
    
    float c = a + b; float d = 3.14 // Both ; and \n serve as terminators

    float m = c ** d // Exponent operator
    
    bool k = c < d < m // Chained comparisons are supported
}

void main() {
    test = SampleFunction(i, j)
    
    string SampleString(string name) { // Allows nested functions
        return "Hello, " + name + "!"
    }

    string wow = SampleString("random user") + test.toString()
    
    System.out.println(wow) // Directly compiles in Java
}
```
## 𓆝𓆟𓆞𓆟𓆞𓆝𓆟𓆞𓆝
Feel free to contribute if you want!
    string TestString(string name) { // Allows nested functions
        return "Hello, " + name + "!"
    }

    string wow = TestString("random user")
    
    System.out.println(wow) // Directly compiles in Java
}
```
## 𓆝𓆟𓆞𓆟𓆞𓆝𓆟𓆞𓆝
Feel free to contribute if you want!
