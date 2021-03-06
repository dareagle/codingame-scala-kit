package com.truelaurel.samplegames.stones

import com.truelaurel.math.geometry.Pos

sealed trait Move

case class Slide(from: Pos, to: Pos) extends Move

case class Add(pos: Pos) extends Move
