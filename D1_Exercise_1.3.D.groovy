print "Please enter the first integer: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
print "Please enter the second integer: "
str = System.console().readLine()
int den = Integer.parseInt(str)
if(num % den == 0) {
    println "Yes"
} else {
    println "No"
}