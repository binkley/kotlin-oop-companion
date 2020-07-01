package hm.binkley.oop

interface BaseCompanion<B : Base<B>> {
    val special: B
    val WHO_AM_I: String

    fun variesByType(): String

    fun makeANewOne(doodah: Int): B
}

abstract class Base<B : Base<B>>(
    val doodah: Int,
    protected val companion: BaseCompanion<B>
) {
    fun special() = companion.special
    fun whoAmI() = companion.WHO_AM_I
    open fun variesByType() = companion.variesByType()

    fun doubleDown(doodah: Int): B = companion.makeANewOne(2 * doodah)

    override fun toString() =
        "${this::class.simpleName}(doodah=$doodah)"
}
