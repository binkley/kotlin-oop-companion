package hm.binkley.oop

interface BaseCompanion {
    val WHO_AM_I: String

    fun variesByType(): String
}

open class Base(
    protected val companion: BaseCompanion
) {
    fun whoAmI() = companion.WHO_AM_I
    open fun variesByType() = companion.variesByType()
}
