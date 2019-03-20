package main

import java.awt.MouseInfo
import java.awt.Robot

fun main(args: Array<String>) {
    val robot = Robot()
    while (true) {
        Thread.sleep(10000)
        var mousePosition = MouseInfo.getPointerInfo().location
        robot.mouseMove(mousePosition.x + 1, mousePosition.y + 1)
        Thread.sleep(10)
        mousePosition = MouseInfo.getPointerInfo().location
        robot.mouseMove(mousePosition.x - 1, mousePosition.y - 1)
    }
}
