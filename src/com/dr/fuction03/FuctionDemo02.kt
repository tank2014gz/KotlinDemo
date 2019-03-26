package com.dr.fuction03

class FuctionDemo02 {
    companion object {
        @JvmStatic
        fun main(args:Array<String>){

            echo.invoke("dongran",28)
            echo("lingming",18)

            dd("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1")
        }

        val echo={name:String,age:Int->
            println("name=$name,age=$age")
        }
        val dd={name1:String,name2:String,name3:String,name4:String,name5:String,name6:String,name7:String,name8:String,name9:String,name10:String,name11:String,
                name12:String,name13:String,name14:String,name15:String,name16:String,name17:String,name18:String,name19:String,name20:String,name21:String,
        name22:String,name23:String,name24:String->
            println("hello")
        }
    }
}