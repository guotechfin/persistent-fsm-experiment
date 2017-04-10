package org.elu.akka

import akka.actor.{ActorSystem, Props}
import akka.cluster.sharding.{ClusterSharding, ClusterShardingSettings}
import com.typesafe.config.ConfigFactory

/** Created by luhtonen on 12/04/16. */
object PersistentFSMApp extends App {
  import AccountAnother._

  //val config = ConfigFactory.load()

  val system = ActorSystem("persistent-fsm-actors")

  val accountRegion = ClusterSharding(system).start(
    typeName = AccountAnother.shardName,
    entityProps = AccountAnother.props,
    settings = ClusterShardingSettings(system),
    extractEntityId = AccountAnother.idExtractor,
    extractShardId = AccountAnother.shardResolver)


  accountRegion ! Operation("12",1000, CR)
  accountRegion ! Operation("12",10, DR)
  accountRegion ! Operation("12",10, DR)
  accountRegion ! Operation("12",10, DR)
  accountRegion ! Operation("12",10, DR)
  accountRegion ! Operation("12",600, CR)

  accountRegion ! Operation("13",1000, CR)
  accountRegion ! Operation("13",10, DR)
  accountRegion ! Operation("13",10, DR)
  accountRegion ! Operation("13",10, DR)
  accountRegion ! Operation("13",10, DR)
  accountRegion ! Operation("13",700, CR)

  //Thread.sleep(20000)
  //system.terminate()
}
