import static net.norivensuu.flux.utils.FluxUtils.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import org.apfloat.Apfloat;
import static net.norivensuu.flux.utils.MathUtils.*;
float i = 1.0F;
float j = 1.0f;
double k = 1.0;
double m = 1.0d;
String str1 = "'string1'";
String str2 = "\"string2\"";
char char1 = 's';
boolean test;
private boolean SampleFunction(float a, float b) {	float c = a + b;	float d = 3.14f;	float m1 = (float) Math.pow(c, d);	float m2 = (float) Math.floor(c / d);	float m3 = (float) Math.ceil(c / d);	m1 = (float) Math.pow(m1, 2);	m2 = (float) Math.pow(m2, 2);		List<String> list = new ArrayList<>() {		{			add("element1");			add("element2");		}	};	boolean k = c < d && d < m;	for (var element : list) {		Print(element, "C# foreach");	}	for (var element : list) {		Print(element, "Java foreach");	}	return k;}
void main() {	Print((estimateTetration(2.0, 5.0)).doubleValue());	test = SampleFunction(i, j);	class _Class_SampleString$38262958 {		String SampleString(String name) {			return String.format("Hello, %s!", name);		}
    }
    var _class_SampleString$38262958 = new _Class_SampleString$38262958();	String wow = _class_SampleString$38262958.SampleString("random user") + test;}
void unfinishedVoid() {	float unfinishedFloat;}
