print "Please enter a numerator: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
print "Please enter a denominator: "
str = System.console().readLine()
int den = Integer.parseInt(str)
int count = 1
int temp = num
int rem = 0
int result = 0
boolean finished = false
if(den == 0) {
    println "Cannot divide by zero."
} else if(den == 1 || den == -1) {
    result = num
} else {
    while(!finished) {
        temp = Math.abs(temp) - Math.abs(den)
        if(temp < Math.abs(den)) {
            rem = temp
            result = count
            finished = true
        }
        count ++
    }
}
if((num < 0 && den > 0) || (num > 0 && den < 0)) {
    result = result * -1
}
if(den != 0 ) {
    println "" + num + " divided by " + den + " is " + result + ", remainder " + rem + "."
}