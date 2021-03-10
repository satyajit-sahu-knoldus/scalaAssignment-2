package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ListTesting extends AnyFlatSpec {
  val test = new ListOperation
  "List(1,2,3)" should "show 3 as last element" in {
    assert(test.endElement(List(1, 2, 3)) === "The last element is 3 which is present at location 3\n\n")
  }
  "List(-1,-2,-3)" should "show -3 as last element" in {
    assert(test.endElement(List(-1, -2, -3)) === "The last element is -3 which is present at location 3\n\n")
  }
  "List()" should "show nil as last element" in {
    assert(test.endElement(List()) === "The list is empty so there are no elements in it")
  }
  "List(Satyajit, Knoldus, Devops)" should "show Devops as last element" in {
    assert(test.endElement(List("Satyajit", "Knoldus", "Devops")) === "The last element is Devops which is present at location 3\n\n")
  }
}



