package com.gitdemo

object HelloGit {
  def main(args: Array[String]): Unit = {

println(convertDecimalToBinaryString(8))

  }

  def convertDecimalToBinaryString (n: Int): String = {
    var x = n
    var binaryString = ""
    while (x > 0) {
      binaryString += (x % 2)
      x = x / 2
    }
    binaryString.reverse

  }


}
