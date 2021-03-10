package com.knoldus

class StackTesting extends org.scalatest.flatspec.AnyFlatSpec {

  "If we use push method it " should "push that element into the stack and should return the stack" in {
    val instance = new StackImplementation(List(20, 30, 40))
    assert(instance.push(50) === List(50, 20, 30, 40))
  }

  "If we use pop method it " should "remove the first element in the stack and return remaining stack" in {
    val instance = new StackImplementation(List(20, 30, 40))
    assert(instance.pop === List(30, 40))
  }

  "If we use peek method it " should "return the top element of the stack" in {
    val instance = new StackImplementation(List(20, 30, 40))
    assert(instance.peek === 20)
  }

  "If we use checkEmpty method it " should "return false if the stack is not empty" in {
    val instance = new StackImplementation(List(20, 30, 40))
    assert(instance.checkEmpty() === false)
  }

  "If we use checkEmpty method it " should "return true if the stack is empty" in {
    val instance = new StackImplementation(List())
    assert(instance.checkEmpty() === true)
  }
  "If we use peek method if the queue is empty it" should "return exception" in {
    val newInstance = new StackImplementation(List())
    assertThrows[NoSuchElementException] {
      newInstance.peek
    }
  }
}