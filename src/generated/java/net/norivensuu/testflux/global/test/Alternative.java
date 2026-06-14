package net.norivensuu.testflux.global.test;
import static net.norivensuu.flux.utils.FluxUtils.*;
import java.io.*;
import java.util.*;
import com.google.gson.*;
import java.lang.*;
public class Alternative {

int factorial(int n) {
if ((n <= 1)) {
return 1;
}
return n * factorial(n - 1);
}

void main() {
String i = input("Enter a number: ");

int number = Integer.getInteger(i);

int result = factorial(number);

print(String.format("The factorial of %s is: %s", number, result));
}

}
