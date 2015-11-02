boolean finished = false
int result = 0
String str = ""
int num = 0
while(!finished) {
    print "Please enter a number (ending with -1): "
    str = System.console().readLine()
    num = Integer.parseInt(str)
    if(num == -1) {
        finished = true
    } else if(num > result) {
        result = num
    }
}
println result