package com.knoldus

import scala.annotation.tailrec

class ListOperation {
  println("*****First Question*****\n")

  /**
   * Method to find the last element and it's position in a list.
   *
   * @param (List: Any, position: Int)
   * @return (Any, Int)
   */

  @tailrec final def endElement(a: List[Any], position: Int = 0): Any = a match {
    case x :: Nil => s"The last element is ${a(0)} which is present at location ${position + 1}\n\n"
    case _ :: remainingList => endElement(remainingList, position + 1)
    case Nil => "The list is empty so there are no elements in it"
  }

  /**
   * Method to print the multiplication table for all the elements in a list.
   *
   * @param (list: List[Int])
   * @return Unit
   */

  def printTables(l: List[Int]): Unit = {
    println("****  Second Question   ****")
    if (l.isEmpty) println("There are no elements in the list ")
    else for (i <- l) for (j <- 0 to 10) {
      print(s"$i*$j=${i * j}\n")
    }
  }
}

object Input extends App {
  val listOperation = new ListOperation
  println(listOperation.endElement(List("Satyajit", "Knoldus", "Engineering", "Devops", "Noida")))
  listOperation.printTables(List(10, 20, 30, 40, 50))
}
