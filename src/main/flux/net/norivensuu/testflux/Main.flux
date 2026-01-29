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