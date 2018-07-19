package Life

  class Grid(cellsAlive:Array[Array[Boolean]]) {
    def cells:Array[Array[Cell]] = cellsAlive.zipWithIndex.map{
      case (row:Array[Boolean],yIndex:Int) => {
        row.zipWithIndex.map{
          case (isAlive:Boolean, xIndex:Int) => Cell(x=xIndex, y=yIndex, alive = isAlive)
        }
      }
    }

    def getCell(x:Int, y:Int): Option[Cell] = {
      if( y < 0 || y >= cells.length || x<0 || x >= cells(y).length){
        None
      } else {
        Some(cells(y)(x))
      }
    }
  }
