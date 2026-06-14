import java.lang.*

var factorial(@NonNull n: int) {
    if (n <= 1) {
        return 1
    }
    return n * factorial(n - 1)
}

def main() {
    var i = input("Enter a number: ")
    var number = Integer.getInteger(i)
    var result = factorial(number)
    print(f"The factorial of {number} is: {result}")
}