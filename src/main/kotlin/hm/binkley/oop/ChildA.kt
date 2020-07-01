package hm.binkley.oop

class ChildA(doodah: Int) : Base<ChildA>(doodah, ChildA) {
    companion object : BaseCompanion<ChildA> {
        private val K = makeANewOne(0)

        override val special = K
        override val WHO_AM_I = "A"

        override fun variesByType() = "Yep, I'm an A"

        override fun makeANewOne(doodah: Int) = ChildA(doodah)
    }
}
