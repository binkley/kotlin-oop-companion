package hm.binkley.oop

interface BaseCompanion<B : Base<B>> {
    val special: B
    val WHO_AM_I: String

    fun variesByType(): String
}

abstract class Base<B : Base<B>>(
    protected val companion: BaseCompanion<B>
) {
    fun special() = companion.special
    fun whoAmI() = companion.WHO_AM_I
    open fun variesByType() = companion.variesByType()
}
