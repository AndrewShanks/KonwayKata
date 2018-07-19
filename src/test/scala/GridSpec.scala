package Life
import org.scalatest.{FlatSpec, Matchers}

class GridSpec extends FlatSpec with Matchers{
  "A grid intialised with a 2d array of alive and dead values" should "allow cells with appropriate values that can be addressed by co-ordinates " in {
    val testGrid = new  Grid(cellsAlive = Array(Array(true, false), Array(true, false)))
    testGrid.getCell(0,0) shouldBe Some(Cell(x=0, y=0, alive = true))
    testGrid.getCell(0,1) shouldBe Some(Cell(x=0, y=1, alive = true))
    testGrid.getCell(1,0) shouldBe Some(Cell(x=1, y=0, alive = false))
    testGrid.getCell(1,1) shouldBe Some(Cell(x=1, y=1, alive = false))
  }

  "A grid intialised with a 2d array of alive and dead values" should "return None for invalid coordinates " in {
    val testGrid = new  Grid(cellsAlive = Array(Array(true, false), Array(true, false)))
    testGrid.getCell(-1,0) shouldBe None
    testGrid.getCell(0,2) shouldBe None
    testGrid.getCell(2,0) shouldBe None
    testGrid.getCell(1,-1) shouldBe None
  }
}
