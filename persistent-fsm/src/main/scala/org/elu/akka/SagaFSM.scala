package org.elu.akka

import akka.persistence.fsm.PersistentFSM

import scala.reflect.{ClassTag, classTag}

object SagaFSM{

}

trait SagaFSM[S,D,E] {//extends PersistentFSM[S,D,E] {

  //override def persistenceId: String = self.path.name

}
