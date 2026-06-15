package net.norivensuu.testflux;
import java.io.*;
import java.util.*;
import java.lang.*;
import org.apfloat.Apfloat;
import static net.norivensuu.flux.utils.MathUtils.*;
import static net.norivensuu.flux.utils.FluxUtils.*;
public class Main {
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

String var4 = "hai";


private boolean SampleFunction(float a, float b) {
float c = float1 + float2;

float d = 3.14f;

float m1 = (float) power(c, d);

float m2 = (float) Math.floor(c / d);

float m3 = (float) Math.ceil(c / d);

m2 = (float) Math.floor(c / d);

m3 = (float) Math.ceil(c / d);

m1 = (float) power(m1, 2);
m2 = (float) power(m2, 2);

int modint1 = 5 % 2;

int modint2 = 5 % 2;

List<List> list1 = new ArrayList<>() {
{
add(List.of("element1"));
add(List.of("element2"));
}
};

var list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

bool1 = c < d && d < 5;

for (var element : list1) {

print(element, "C# foreach");

}
for (var element : list1) {

print(element, "Java foreach");

}
boolean ternaryBool = ((list1.size() > list2.size()) ? false : true);

return ((1 < 2 && 2 < 5) ? ternaryBool : false);
}

void main() {
print((double) estimateTetration(double1, double2));
boolean test = SampleFunction(float1, float2);

class _Class_voidDef$1804568540 {

void voidDef(float voidFloat1, float voidFloat2) {
if ((approximately(5, voidFloat1, 5))) {
print("yay1");
if ((approximately(-5, voidFloat1, 5))) {
print("yay2");
}
if ((approximately(-5, voidFloat1, 5))) {
print("yay3");
}
}
}
}
var _class_voidDef$1804568540 = new _Class_voidDef$1804568540();
final Integer[] i = (Integer[])new ArrayList<>(List.of(0)).toArray();

class _Class_SampleString$1723215549 {

String SampleString(String name) {
String s = String.format("Hello, %s! How are you today my little fella? The i is: %s", name, i[0]);

i[0] = 1;
return s;
}
}
var _class_SampleString$1723215549 = new _Class_SampleString$1723215549();
String sampleString = String.format("%s\ntest", _class_SampleString$1723215549.SampleString("random user"));

print(sampleString);
}

int varFunction1() {
return 1;
}

double varFunction2() {
if ((bool1)) {

List<Double> _generator_i_549003710 = new ArrayList<>();
{
for (var i : range(1000)) {
_generator_i_549003710.add(1.0);
}
}return _generator_i_549003710.getFirst();
}else {
{
{
for (var i : range(1000)) {
print(i);
}
}
}
;
return 1.0 + 1;
}
}

void unfinishedVoid() {
float illegalFloat;

class _Class_unpolishedVoid$860326447 {

void unpolishedVoid() {
print(estimateTetration(5, 5));
}
}
var _class_unpolishedVoid$860326447 = new _Class_unpolishedVoid$860326447();
class _Class_suboptimalVoid$222556677 {

void suboptimalVoid() {
for (var i : range(1000000)) {

print(i);

}
}
}
var _class_suboptimalVoid$222556677 = new _Class_suboptimalVoid$222556677();
class _Class_uglyVoid$1393726189 {

void uglyVoid() {
List<Integer> _generator_x_702392974 = new ArrayList<>();
{
for (var x : range(100)) {
_generator_x_702392974.add(x);
}
}
_generator_x_702392974.getFirst();
}
}
var _class_uglyVoid$1393726189 = new _Class_uglyVoid$1393726189();
}
float exp1 = (float)power(2, power(3, 4));


}
