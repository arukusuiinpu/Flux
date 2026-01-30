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