package com.dr.function01

import java.io.File

/**
 * 扩展函数
 */
class FunctionExDemo {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val file = File("KotlinDemo01.iml")
            val content = file.readText()
            println(content)

            println(file.androidName)

            val thread = Thread({ -> Unit


            })
            thread.start()

        }


    }
}