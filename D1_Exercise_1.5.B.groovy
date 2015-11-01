boolean finished = false
while(!finished) {
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
        case 0:
            println "You will be put in touch with an operator."
            finished = true
            break;
        case 1:
            println "You have selected 'Checking your balance'."
            finished = true
            break;
        case 2:
            println "You have selected 'Purchases'."
            finished = true
            break;
        case 3:
            println "You have selected 'Refunds'."
            finished = true
            break;
        case 4:
            println "You have selected 'Queries about the warranty'."
            finished = true
            break;
        case 5:
            println "You have selected 'Returning faulty goods'."
            finished = true
            break;
        default:
            println "That is not a valid option, please try again."
            break;
    }
}