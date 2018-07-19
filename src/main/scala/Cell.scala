package Life
case class Cell(alive:Boolean) {
  def createDescendant() = {
    Cell(alive = false)
  }
}
