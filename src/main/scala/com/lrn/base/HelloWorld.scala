package com.lrn.base

object HelloWorld {
    def  main(args: Array[String]) {
        println(hello())
    }

    def hello() = "Hello, world!"

    def cube(x: Int): Int= x * x * x
}