package pack;

public class MethodOverloading {
static int addition(int a, int b){
	return a+b;
}
static int addition(int a, int b, int c){
	return a+b+c;
}
/*/2) Method Overloading: changing data type of arguments...In this example, 
 * we have created two methods that differs in data type. 
The first add method receives two integer arguments and 
second add method receives two double arguments.*/

double addition(double a, double b){
	return a+b;
}

	}
