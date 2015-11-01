boolean finished = false
String str = ""
int num = 0
int count = 0
while(!finished) {
    print "Please enter a number (ending with 0): "
    str = System.console().readLine()
    num = Integer.parseInt(str)
    if(num != 0) {
        count++
    } else {
        finished = true
    }
}
println "You have entered " + count + " numbers."