package dmg

trait Service {

  locally {
    val _ = start()
  }

  def start(): Unit = {
    println("Start")

  }
}
