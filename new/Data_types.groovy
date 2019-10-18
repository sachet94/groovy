
//byte
byte b = 10
println b
println b.getClass().getName()
//or : We ca use def in place of byte
def c = 59
println c.getClass().getName()
println c 
//or when writing def and wanting to know data types
 def r = (byte)59
println r.getClass().getName()
println r

//To check minimun and maximum range for byte 
println Byte.MIN_VALUE
println Byte.MAX_VALUE

println "===================="

//short

short s = 155
println Short.MIN_VALUE
println Short.MAX_VALUE

println "===================="

//int

int i = 100
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println "===================="

//long

long l = 809
println Long.MIN_VALUE
println Long.MAX_VALUE
println "===================="

//float
float f = 90005
println Float.MIN_VALUE
println Float.MAX_VALUE
println "===================="

//double
double w = 9000500
println Double.MIN_VALUE
println Double.MAX_VALUE
println "===================="

//char it is used to save char but only one character at a time. The defined character should be in single inverted commas

char p = 'A' 
println p 
println "===================="


//Boolean : it is used to store boolean values only like true/false and nothing else. All or and operation that results in true or false  
boolean flag = true
println flag
println "===================="

//String: It should be always in double inverted commas

String str = 'groovy'
println str