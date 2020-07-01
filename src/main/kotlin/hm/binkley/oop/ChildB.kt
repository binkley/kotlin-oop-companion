package hm.binkley.oop

class ChildB(doodah: Int) : Base<ChildB>(doodah, ChildB) {
    override fun variesByType() =
        "I'm thinking about '${super.variesByType()}` ..."

    companion object : BaseCompanion<ChildB> {
        private val K = makeANewOne(1)

        override val special = K
        override val WHO_AM_I = "B"

        override fun variesByType() = "Whoa, I'm a B, not an A!"

        override fun makeANewOne(doodah: Int) = ChildB(doodah)
    }
}
