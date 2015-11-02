print "Please enter the time: "
String str = System.console().readLine()
int time = Integer.parseInt(str)
if(time < 0 || time >= 2400) {
    println "?"
} else if(time < 1200) {
    println "Good morning"
} else if(time > 1159 && time < 1800) {
    println "Good afternoon"
} else if(time > 1800) {
    println "Good evening"
}