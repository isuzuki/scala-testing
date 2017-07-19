package com.isuzuki

import org.scalamock.scalatest.MockFactory
import org.scalatest.{Matchers, WordSpec}

class GreeterTest extends WordSpec with Matchers with MockFactory {
  "Greeter" can {
    "hello return correctly string" in {
      Greeter.hello shouldBe "Hello!"
    }

    "hello return mock string" in {
      val greeterMock = mock[Greeter]
      (greeterMock.hello _).expects().returns("Good Morning!")

      greeterMock.hello shouldBe "Good Morning!"
    }
  }
}
