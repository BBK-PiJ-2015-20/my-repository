print "Please enter the first salary: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter the second salary: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
if((num1 + num2) > 40000) {
    println "You are due for higher rate tax."
} else {
    println "You are not due for higher rate tax."
}