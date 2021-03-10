package com.knoldus

class StackImplementation(var list: List[Any] = List()) {
  /**
   * Method to push element into the stack.
   *
   * @param (element: Any)
   * @return List
   */
  def push(element: Any): List[Any] = {
    list = element :: list
    list
  }

  /**
   * Method to pop the top element from the stack in "Last In First Out" order.
   *
   * @return List
   */


  def pop: List[Any] = {
    list = list.drop(1)
    list
  }

  /**
   * Method to return the top element from the stack.
   *
   * @return Any
   */

  def peek: Any = {
    list.head
  }

  /**
   * Method to check whether the stack is empty or not.
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
   * Method to print the stack.
   *
   * @return Unit
   */


  def print(): Unit = {
    println(list)
  }
}

object Demo1 extends App {
  val obj = new StackImplementation()
  obj.push(2)
  obj.push(3)
  obj.push(4)
  obj.push(5)
  obj.print()
  obj.pop
  println("After performing pop the stack is")
  obj.print()
}
