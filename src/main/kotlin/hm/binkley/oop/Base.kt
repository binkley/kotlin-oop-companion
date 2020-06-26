package hm.binkley.oop

interface BaseCompanion {
    val WHO_AM_I: String
}

open class Base(
    protected val companion: BaseCompanion
) {
    fun whoAmI() = companion.WHO_AM_I
}
