print "Please enter a number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter a second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
print "Please enter a third number: "
str = System.console().readLine()
int num3 = Integer.parseInt(str)
String result = ""
if(num1 > num2) {
    if(num2 > num3) {
        result = "" + num3 + ", " + num2 + ", " + num1
    } else if(num3 > num1) {
        result = "" + num2 + ", " + num1 + ", " + num3
    } else {
        result = "" + num2 + ", " + num3 + ", " + num1
    }
} else {
    if(num1 > num3) {
        result = "" + num3 + ", " + num1 + ", " + num2
    } else if(num2 > num3) {
        result = "" + num1 + ", " + num3 + ", " + num2
    } else {
        result = "" + num1 + ", " + num2 + ", " + num3
    }
}
println result