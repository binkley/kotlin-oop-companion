package hm.binkley.oop

class ChildA : Base<ChildA>(ChildA) {
    companion object : BaseCompanion<ChildA> {
        private val K = ChildA()

        override val special = K
        override val WHO_AM_I = "A"

        override fun variesByType() = "Yep, I'm an A"
    }
}
