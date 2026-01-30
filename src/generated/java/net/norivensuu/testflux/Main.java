import java.io.*;
import java.util.*;
import java.lang.*;
float i = 1.0F;
float j = 1.0f;
double k = 1.0;
double m = 1.0d;
String str1 = "'string1'";
String str2 = "\"string2\"";
char char1 = 's';
boolean test;
private boolean SampleFunction(float a, float b) {	float c = a + b;	float d = 3.14f;	float m = (float) Math.pow(c, d);	List<String> list = new ArrayList<>() {		{			add("element1");			add("element2");		}	};	boolean k = c < d && d < m;	for (var element : list) {		System.out.println(element);	}	for (var element : list) {		System.out.println(element);	}	return k;}
void main() {	test = SampleFunction(i, j);	class _Class_SampleString$555273695 {		String SampleString(String name) {			return "Hello, " + name + "!";		}
    }
    var _class_SampleString$555273695 = new _Class_SampleString$555273695();	String wow = _class_SampleString$555273695.SampleString("random user") + test;}
