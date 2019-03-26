package com.dr.function

class Function01 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            echo("小明", 29)
            count()

        }


        fun echo(name: String = "dongran") {
            println("$name")
        }

        fun echo(name: String, age: Int = 19) = println("$name,$age")

        fun count() {
            var j = 15
            fun add() {
                println("j=$j")
                ++j

            }

            for (i in 1..10) {
                add()
            }
        }
    }
}