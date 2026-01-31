import static net.norivensuu.flux.utils.FluxUtils.*;
import java.io.*;
import java.util.*;
import static net.norivensuu.flux.utils.MathUtils.*;
void main() {	double base = 2.0;	double power = 3.0;	float energy = power(base, power);	double tetration = estimateTetration(base, 3);	if (5 < energy && energy < 15) {		Print(energy, "is stable");	}	Print(tetration);}
