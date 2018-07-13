package Life

import org.scalatest._

class CellSpec extends FlatSpec with Matchers{
 "A cell initialised as alive" should "be alive" in {
   val testCell = new Cell(alive = true)
   testCell.alive shouldBe true
 }
  "A cell initialised as dead" should "be dead" in {
    val testCell = new Cell(alive = false)
    testCell.alive shouldBe false
  }
}
