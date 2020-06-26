package hm.binkley.oop

class ChildA : Base(ChildA) {
    companion object : BaseCompanion {
        override val WHO_AM_I = "A"

        override fun variesByType() = "Yep, I'm an A"
    }
}
