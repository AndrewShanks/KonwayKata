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

}
