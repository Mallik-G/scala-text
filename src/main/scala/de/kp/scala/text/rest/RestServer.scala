package de.kp.scala.text.rest
/* Copyright (c) 2014 Dr. Krusche & Partner PartG
 * 
 * This file is part of the Scala-Text project
 * (https://github.com/skrusche63/scala-text).
 * 
 * Scala-Text is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * Scala-Text is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with
 * Scala-Text. 
 * 
 * If not, see <http://www.gnu.org/licenses/>.
 */

import akka.actor.ActorSystem

import de.kp.scala.text.Configuration

object RestServer {
  
  private def start(args:Array[String],system:ActorSystem) {

    val (host,port) = Configuration.rest
    
    /* Start REST API */
    new RestApi(host,port,system).start()
      
  }
  
  def main(args: Array[String]) {
    start(args, ActorSystem("RestServer"))
  }
  
}