print "Please enter a number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter another number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int count = 1
int result = 0
if(num1 == 0 || num2 == 0) {
    result = 0
} else if(Math.abs(num1) == 1) {
    result = Math.abs(num2)
} else {
    while(count <= Math.abs(num1)) {
        count++
        result = result + Math.abs(num2)
    }
}
if((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
    result = result / -1
}

println "The product is: " + result + "."