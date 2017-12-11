package Main

import scalanimate.Canvas
import org.scalajs.dom.document
import org.scalajs.dom.raw.HTMLCanvasElement

import scalanimate.shapes.mutable.{Circle, Oval, Polygon, Rectangle}

object Main {
  def main(args: Array[String]): Unit = {
    val c = Canvas(document.getElementById("shapesCanvas").asInstanceOf[HTMLCanvasElement])
    Circle(100, 50, 20)(c)
    Rectangle(80, 130, 50, 120)(c)
    Polygon(200, 80, 30, 5)(c)
    Oval(150, 20, 60, 40)(c)
  }
}
