//Operators : Are sysmbols that tell the compiler to perform specific operations and these can be arithmetic add, substract,divide,
              greater less than.

//Arithematic Operator
/* + = add; - = substract; * = multiply; / = divide; % = remainder; ** = power. intdiv = interger division.
assert is statement used to check LHS=RHS*/
assert 2 + 3 == 5
assert 4 * 5 == 20
assert 9.intdiv(5) == 1
assert 3.2.plus(3.2) == 6.4 //performs addition 

//After running the script in operaters if it give doesnt give any output it is good failure gives output.


//Unary Operators : + and - are unary operators
assert +3 == 3
assert -7 == 0 - 7

//Increment ++ & Decrement --
int i = 10
println i++ //Value gets incremented by 1 when we add ++ symbol.
println i  //output will be 11
println (++i) //adding ++before variable will increase the value by one with the declared variable and then print the value.

//Assigment arthimetic Operator; +=, -=, *=, /=, %=, **=

def b = 4
b += 3 //b= b + 3
assert b == 7



//Relational Operators: ==, !=, <, <=, >, >=
assert 3 + 66 == 69
assert 3 + 66 != 68 //shoud=ld not be equal to

//Logical Operators: && Logical "and" both side that is RHS and LHR should be true i.e.,true && true, || Logical "or" any side that is RHS and LHR should be true i.e.,false && true, 
// ! it performs not operations i.e., true !  will give false 
assert !false //it performs not operation
assert true && true //assert true && false will not pass as it performs and operation
assert true || true // or operation
//Precedence : The logical "not" has more priority than logical "and"; The logical "and" has more priority than logical "or".
assert (!false && false) == false
assert true || false && true




//ShortCircuiting: The logical "or" operator supports short circuiting if the left oprand is true it knows that the result will be true and in any case it wont evalueate the right oprand.


//Bitwise operators:
/* bitwise "and"
bitwise "or"
bitwise "xor" (opposite of or)
bitwise negation
Bitwise operators are applied on a byte or an int and return an int*/

int o = 20
int u = 25
println (o & u) //output will be 16 because it will convert 20 and 25 in binary and the multiply and the o/p will be in binary

println Integer.toBinaryString(20)
println Integer.toBinaryString(25)
println Integer.toBinaryString(o & u)
println Integer.parseInt("100000",2)

//Conditional Operators: the not operator is represented with an exclamtion mark
assert (!true) == false
