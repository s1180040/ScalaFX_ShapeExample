package org.zukkey40.example.scalafx.shape

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.layout.{GridPane, Pane}
import scalafx.scene.shape.{Polyline, Circle, Rectangle}
import scalafx.scene.paint.Color
import scalafx.geometry.Pos


/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/06/01
 *
 * 長方形、円、折れ線を表示するサンプルになります。
 */
object ShapeExampleMain extends JFXApp{
  /**
   * グリッド状の枠組みからなるレイアウトをルートとしています。
   */
  val root: GridPane = new GridPane{
    hgap = 15.0
    vgap = 15.0
    alignment = Pos.CENTER
  }

  val rectangle: Rectangle = new Rectangle{
    height = 70
    width = 70
    stroke = Color.BLACK
    fill = Color.YELLOW
  }
  root.add(rectangle, 0, 0) //(x, y) = (0, 0)の位置に、四角形を追加する

  val circle: Circle = new Circle{
    radius = 35.0
    stroke = Color.DARKBLUE
    fill = Color.LIGHTBLUE
  }
  root.add(circle, 1, 0) //(1, 0)の位置に、円を追加する

  val trapezoid: Polyline = new Polyline{
    points += (
      0.0, 0.0,
      90.0, 0.0,
      80.0, 50.0,
      10.0, 50.0,
      0.0, 0.0
      )
    fill = Color.VIOLET
    stroke = Color.DARKRED
    alignmentInParent = Pos.CENTER
  }
  root.add(trapezoid, 0, 1, 2, 1) //(0, 1)~(1,1)の位置に、折れ線（台形）を追加する

  stage = new PrimaryStage() {
    title = "FXML example"
    height = 300
    width = 300
    scene = new Scene(root)
  }

}
