import java.lang.* // Inherits Java libraries and importing structure
using com.google.gson.*; // Or you can use C# if you want

float i = 1.0F // Java handles as float
float j = 1.0 // Same here

double k = 1.0 // Java handles as double
double m = 1.0d // Same here

String str1 = '\'string1\'' // Directly uses Java String type, boolean also works
string str2 = "\"string2\"" // Uses wrapped Flux string type

char char1 = 's' // Single symbol, technical or '' strings are treated as chars

bool test;

private bool SampleFunction(float a, float b) { // Inherits modifiers from Java

    float c = a + b; float d = 3.14 // Both ';' and '\n' serve as terminators

    float m = c ** d // Exponent operator
    
    List<string> list = new ArrayList() {{ add("element1"); add("element2"); }} // Directly compiles in Java

    bool k = c < d < m // Chained comparisons are supported

    foreach (var element in list) { // Foreach works both in C# format
        System.out.println(element)
    }

    for (var element : list) { // And Java format (':' and 'in' are interchangeable for both)
        System.out.println(element)
    }

    return k
}

void main() {
    test = SampleFunction(i, j)

    string SampleString(string name) { // Allows nested functions
        return "Hello, " + name + "!"
    }

    string wow = SampleString("random user") + test
}