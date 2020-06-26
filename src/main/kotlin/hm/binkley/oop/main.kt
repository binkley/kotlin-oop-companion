package hm.binkley.oop

fun main() {
    println("== OOP COMPANIONS")

    println()
    println("== A")
    val childA = ChildA()
    println(childA.whoAmI())
    println(childA.variesByType())

    println()
    println("== B")
    val childB = ChildB()
    println(childB.whoAmI())
    println(childB.variesByType())
}
