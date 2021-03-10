package com.knoldus

class QueueImplementation(var list: List[Any] = List()) {

  /**
   * Method to add element to the queue.
   *
   * @param element Element of the type Any.
   * @return List[Any]
   */

  def enqueue(element: Any): List[Any] = {
    list = element :: list
    list
  }

  /**
   * Method to remove elements from the queue in "First In First Out" order.
   *
   * @param List [Any]
   * @return List
   */

  def dequeue: List[Any] = {
    list = list.dropRight(1)
    list
  }

  /**
   * Method to return the head element.
   *
   * @return Any
   */

  def queueFront: Any = {
    list.last
  }

  /**
   * Method to return the rear element.
   *
   * @return Any
   */


  def queueRear: Any = {
    list.head
  }

  /**
   * Method to check if the queue is empty or not.
   *
   * @return Boolean
   */

  def checkEmpty(): Boolean = {
    list match {
      case Nil => true
      case _ => false
    }
  }

  /**
   * Method to print the queue.
   *
   * @return Unit
   */


  def print(): Unit = {
    println(list)
  }

}

object Demo extends App {
  val obj = new QueueImplementation
  obj.enqueue(10)
  obj.enqueue(20)
  obj.enqueue(30)
  obj.enqueue(40)
  obj.dequeue.head
  obj.queueFront
  obj.queueRear
  obj.checkEmpty()
  obj.print()
}


