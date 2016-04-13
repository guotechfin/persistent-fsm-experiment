name := "akka-cluster"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.3",
  "com.typesafe.akka" %% "akka-remote" % "2.4.3",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.3",
  "com.typesafe.akka" %% "akka-cluster-tools" % "2.4.3",
  "com.typesafe.akka" %% "akka-cluster-sharding" % "2.4.3",
  "com.typesafe.akka" %% "akka-persistence" % "2.4.3",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.3",
  "org.iq80.leveldb" % "leveldb" % "0.7",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
)