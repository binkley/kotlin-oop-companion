package hm.binkley.oop

class ChildB : Base(ChildB) {
    override fun variesByType() =
        "I'm thinking about '${super.variesByType()}` ..."

    companion object : BaseCompanion {
        override val WHO_AM_I = "B"

        override fun variesByType() = "Whoa, I'm a B, not an A!"
    }
}
