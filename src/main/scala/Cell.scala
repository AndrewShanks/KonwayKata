package Life
case class Cell(x:Int = 0, y:Int =0, alive:Boolean) {
  def createDescendant() = {
    Cell(x,y,alive = false)
  }

  def countLivingNeighbours(grid: Grid): Int = {
    val xcoords = x-1 to x+1
    val ycoords = y-1 to y+1
    println(xcoords)
    println(ycoords)
    val coords = for {
      xcoord <- xcoords
      ycoord <- ycoords
      if (!(xcoord == x && ycoord == y))
    } yield(xcoord,ycoord)

    println(s"Getting neighbours for $x $y")
    println(coords)
    val neighbours:IndexedSeq[Option[Cell]] = coords .map( pair  =>  grid.getCell(pair._1,pair._2))
    println(neighbours)
    neighbours.foldLeft(0)((count, cellOpt) =>  if(cellOpt.exists(_.alive)){1+ count} else{0+ count} )
  }
}
