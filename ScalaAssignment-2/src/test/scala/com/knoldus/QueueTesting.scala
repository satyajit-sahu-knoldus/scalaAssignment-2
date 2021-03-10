package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTesting extends AnyFlatSpec {
  val queueObject = new QueueImplementation()

  "If you provide 50, then the method " should "push List(50) into the queue" in {
    assert(queueObject.enqueue(50) === List(50))
  }

  "If you call the dequeue method, it " should "remove the first entered element from the queue and return the remaining queue" in {
    val queueObject = new QueueImplementation()
    queueObject.enqueue(10)
    queueObject.enqueue(50)
    queueObject.enqueue(20)
    assert(queueObject.dequeue === List(20, 50))
  }

  "If you call the queueFront method, it " should "return the first entered element in the queue." in {
    val queueObject = new QueueImplementation()
    queueObject.enqueue(10)
    queueObject.enqueue(50)
    queueObject.enqueue(20)
    assert(queueObject.queueFront === 10)
  }
  "If you call the queueRear method, it " should "return the last entered element in the queue." in {
    val queueObject = new QueueImplementation()
    queueObject.enqueue(10)
    queueObject.enqueue(50)
    queueObject.enqueue(20)
    assert(queueObject.queueRear === 20)
  }
  "If you call the checkEmpty method on a non-empty queue, it " should "return false" in {
    val queueObject = new QueueImplementation()
    queueObject.enqueue(10)
    queueObject.enqueue(50)
    queueObject.enqueue(20)
    assert(queueObject.checkEmpty() === false)
  }
  "If you call the checkEmpty method on an empty queue, it " should "return true" in {
    val queueObject = new QueueImplementation()
    assert(queueObject.checkEmpty() === true)
  }

}
