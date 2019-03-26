package com.dr.function01

import java.io.File
import java.nio.charset.Charset


fun File.read(charset: Charset = Charsets.UTF_8): String {
    return readBytes().toString(charset)
}

val File.androidName: String
    get() = "android"
