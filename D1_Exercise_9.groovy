boolean finished = false
String str = ""
String result = "Yes"
int num = 0
print "Please enter a number (ending with -1): "
str = System.console().readLine()
int prior = Integer.parseInt(str)
while(!finished) {
    print "Please enter another number (ending with -1): "
    str = System.console().readLine()
    num = Integer.parseInt(str)
    if(num == -1) {
        finished = true
    } else if(num == prior + 1 && result == "Yes") {
        prior = num
        result = "Yes"
    } else {
        result = "No"
    }
}
println result