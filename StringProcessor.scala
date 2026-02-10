object StringProcessor {
  def filterByLength(str: List[String]): List[String] = {
    str.filter(_.length > 3).map(_.toUpperCase)
  }

  def log(level: String, lst: List[String]): Unit = {
    println(s"$level: $lst")
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")

    val filteredArray = filterByLength(strings)
    val printInfo = log("Processed strings", _: List[String])

    printInfo(filteredArray)
  }
}
