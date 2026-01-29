# 𓆝𓆟𓆞Flux𓆟𓆞𓆝
_As you can guess this is not a professional\
project by any means in this initial state._
# 𓆝𓆟𓆞____𓆟𓆞𓆝

## Mock plans:
- More useful operators and aliases (Python, C#)
- := operator
- Better generics (C# inspired; includes single function parametrization for 2+ types)
- Non-finalized or dynamic lambdas
- Provide built-in solutions for not implemented Java features (https://en.wikipedia.org/wiki/Comparison_of_C_Sharp_and_Java)
- Inherited libraries (built-in or 'no import' libraries are defined using metadata)
- Powerful annotation (dynamically derived values in interfaces for example)
- A custom 'plug-and-code' Java compiler (via a built-in Maven)
- Realtime bytecode modifications
- Built-in mixin-like functionality
- C# realtime compilation and execution support

_Sorted based on plausibility of quick implementation and urgency._

## Example code:
```
float i = 1.0F // Java handles as float
float j = 1.0 // Same here

double k = 1.0 // Java handles as double
double m = 1.0d // Same here

private float Calculate(float a, float b) { // Inherits modifiers from Java
    
    float c = a + b; float d = 10 // Both ; and \n serve as terminators
    return c + d
    
}

void main() {
    Calculate(i, j)
    
    string TestString(string name) { // Allows nested functions
        return "Hello, " + name + "!"
    }

    string wow = TestString("random user")
    
    System.out.println(wow) // Directly compiles in Java
}
```
## 𓆝𓆟𓆞𓆟𓆞𓆝𓆟𓆞𓆝
Feel free to contribute if you want!