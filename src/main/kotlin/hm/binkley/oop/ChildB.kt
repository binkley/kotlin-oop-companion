package hm.binkley.oop

class ChildB : Base<ChildB>(ChildB) {
    override fun variesByType() =
        "I'm thinking about '${super.variesByType()}` ..."

    companion object : BaseCompanion<ChildB> {
        private val K = ChildB()

        override val special = K
        override val WHO_AM_I = "B"

        override fun variesByType() = "Whoa, I'm a B, not an A!"
    }
}
