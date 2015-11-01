print "Please enter a number: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
if(num % 2 != 0) {
    result = "Prime"
} else {
    result = "Not prime"
}
println result