package com.dr.fuction04

class FuctionDemo03 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            onif(true) {
                println("kkkkkk")
            }
        }

        fun onif(onlyInf: Boolean, block: () -> Unit) {
            if (onlyInf) {
                block()
            }
        }


    }
}