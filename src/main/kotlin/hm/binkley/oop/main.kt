package hm.binkley.oop

fun main() {
    println("== OOP COMPANIONS")

    println()
    println("== A")
    val childA = ChildA(2)
    println(childA.whoAmI())
    println(childA.variesByType())
    println(childA.doubleDown(3))

    println()
    println("== B")
    val childB = ChildB(11)
    println(childB.whoAmI())
    println(childB.variesByType())
    println(childB.doubleDown(13))
}
