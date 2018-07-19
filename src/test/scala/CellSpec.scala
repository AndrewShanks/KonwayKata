package Life

import org.scalatest._

class CellSpec extends FlatSpec with Matchers{
 "A cell initialised as alive" should "be alive" in {
   val testCell = Cell(alive = true)
   testCell.alive shouldBe true
 }
  "A cell initialised as dead" should "be dead" in {
    val testCell = Cell(alive = false)
    testCell.alive shouldBe false
  }
  "An isolated cell intialised as dead" should "create a dead descendant" in {
    val testCell = Cell(alive = false)
    testCell.createDescendant() shouldBe Cell(alive = false)
  }

  "An isolated cell intialised as alive" should "create a dead descendant" in {
    val testCell = Cell(alive = false)
    testCell.createDescendant() shouldBe Cell(alive = false)
  }

  "A cell given grid co-ordinates" should "hold its grid coordinates" in {
    val testCell = Cell(x = 0, y = 1, alive = true)
    testCell.x shouldBe 0
    testCell.y shouldBe 1
  }

  "A cell given grid co-ordinates" should "create a descendant with the same co-ordinates" in{
    val testCell = Cell(x = 0, y = 1, alive = true)
    val descendant = testCell.createDescendant()
    descendant.x shouldBe testCell.x
    descendant.y shouldBe testCell.y
  }

  "A cell in the corner of a grid" should "be able to count its living neighbours" in {
    val testGrid = new Grid(Array(Array(true, false),
                            Array(true, true)))
    testGrid.getCell(0,0).get.countLivingNeighbours(testGrid) shouldBe 2
    testGrid.getCell(0,1).get.countLivingNeighbours(testGrid) shouldBe 2
    testGrid.getCell(1,0).get.countLivingNeighbours(testGrid) shouldBe 3
    testGrid.getCell(1,1).get.countLivingNeighbours(testGrid) shouldBe 2
  }
}
