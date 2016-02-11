package me.yuhuan.ygui

import javafx.application.Platform
import javafx.embed.swing.JFXPanel
import javafx.stage.Stage
import javax.swing.SwingUtilities

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
object JavaFxUtil {
  def showStage(f: Stage => Unit) = {
    SwingUtilities.invokeLater(new Runnable {
      def run(): Unit = {
        new JFXPanel
        Platform.runLater(new Runnable {
          def run(): Unit = {
            val stage = new Stage()
            f(stage)
            stage.show()
          }
        })
      }
    })
  }
}
