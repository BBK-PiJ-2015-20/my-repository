println "Please choose an option: "
println "For 'Checking your balance', please enter 1"
println "For 'Purchases', please enter 2"
println "For 'Refunds', please enter 3"
println "For 'Queries about the warranty', please enter 4"
println "For 'Returning faulty goods', please enter 5"
println "For any other query, please enter 0"
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
switch (choice) {
    case 1:
        println "You have selected 'Checking your balance'."
    case 2:
        println "You have selected 'Purchases'."
    case 3:
        println "You have selected 'Refunds'."
    case 4:
        println "You have selected 'Queries about the warranty'."
    case 5:
        println "You have selected 'Returning faulty goods'."
    default:
        println "You will be put in touch with an operator."
}