package org.http4s.blaze.channel.nio1

/** Provides [[SelectorLoop]]s for NIO1 network services */
trait SelectorLoopPool {
  /** Get the next loop with which to attach a connection */
  def nextLoop(): SelectorLoop

  /** Shut down all the [[SelectorLoop]]s */
  def close(): Unit
}
