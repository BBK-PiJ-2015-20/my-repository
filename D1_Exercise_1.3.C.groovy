print "Please enter your mark: "
String str = System.console().readLine()
int mark = Integer.parseInt(str)
if(mark >= 70) {
    println "An exceptional result!"
    println "We expect a first-class project from you."
} else if(mark >= 50) {
    println "A satisfactory result."
    println "You may proceed with your project."
} else {
    println "I'm afraid that you have failed."
    println "You may re-enter next year."
}