package com.isuzuki

import org.scalatest.{Matchers, WordSpec}

class GreeterTest extends WordSpec with Matchers {
  "Greeter" can {
    "hello return correctly string" in {
      Greeter.hello shouldBe "Hello!"
    }
  }
}
