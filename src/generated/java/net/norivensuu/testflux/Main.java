import static net.norivensuu.flux.utils.FluxUtils.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import org.apfloat.Apfloat;
import static net.norivensuu.flux.utils.MathUtils.*;
float float1 = 1.0F;
float float2 = 1.0f;
double double1 = 1.0;
double double2 = 1.0d;
String str1 = "'string1'";
String str2 = "\"string2\"";
char char1 = 's';
boolean bool1;
long j = 0L;
float var1 = 1.0F;
float var2 = 1.0F;
int var3 = varFunction1();
private boolean SampleFunction(float a, float b) {	float c = float1 + float2;	float d = 3.14f;	float m1 = (float) power(c, d);	float m2 = (float) Math.floor(c / d);	float m3 = (float) Math.ceil(c / d);	m1 = (float) power(m1, 2);	m2 = (float) power(m2, 2);		List<String> list = new ArrayList<>() {		{			add("element1");			add("element2");		}	};	var bool1 = c < d && d < 5;	for (var element : list) {		Print(element, "C# foreach");	}	for (var element : list) {		Print(element, "Java foreach");	}	return ((1 < 2 && 2 < 5) ? false : true);}
void main() {	Print(estimateTetration(double1, double2));	boolean test = SampleFunction(float1, float2);	int i = 0;	class _Class_SampleString$286658790 {		String SampleString(String name) {			return String.format("Hello, %s! How are you today my little fella? The i is: %s", name, i);		}
    }
    var _class_SampleString$286658790 = new _Class_SampleString$286658790();	String sampleString = _class_SampleString$286658790.SampleString("random user") + "\n" + test;	Print(sampleString);}
void unfinishedVoid() {	float unfinishedFloat;	float illegalFloat;}
int varFunction1() {	return 1;}
double varFunction2() {	if ((bool1)) {		return 1.0;	}else {		return 1.0;	}}
