import com.lrn.base.HelloWorld
import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {
    test("HelloWorld.hello") {
        assert(HelloWorld.hello() === "Hello, world!")
    }

    test("HelloWorld.cube") {
        assert(HelloWorld.cube(10) === 1000)
        assert(HelloWorld.cube(3) === 27)
    }
}