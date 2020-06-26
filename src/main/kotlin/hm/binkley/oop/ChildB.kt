package hm.binkley.oop

class ChildB : Base(ChildB) {
    companion object : BaseCompanion {
        override val WHO_AM_I = "B"
    }
}
