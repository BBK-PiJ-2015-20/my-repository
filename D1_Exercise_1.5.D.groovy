boolean finished = false
String str = ""
int zero = 0
int pos = 0
int neg = 0
int num = 0
while(!finished) {
    print "Please enter a number ('END' to finish): "
    str = System.console().readLine()
    if(str == "END") {
        finished = true
    } else {
        num = Integer.parseInt(str)
        if(num == 0) {
            zero = zero + 1
        } else if(num > 0) {
            pos = pos + 1
        } else if(num < 0) {
            neg = neg + 1
        }
    }
}
println "You entered the following: "
println "Zeroes: " + zero
println "Positives: " + pos
println "Negatives: " + neg