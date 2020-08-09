package helloworld

object HelloWorld {
    def  main(args: Array[String]) {
        println(hello())
    }

    def hello() = "Hello, world!"

    def cube(x: Int) = x * x * x
}