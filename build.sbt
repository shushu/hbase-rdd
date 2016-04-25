name := "hbase-rdd"

organization := "eu.unicredit"

version := "0.7.1"

scalaVersion := "2.10.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:reflectiveCalls"
)

org.scalastyle.sbt.ScalastylePlugin.Settings

resolvers ++= Seq(
  "Hadoop Releases" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)

val sparkVersion = "1.6.0"
val hbaseVersion = "1.2.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.hbase" % "hbase-common" % hbaseVersion,
  "org.apache.hbase" % "hbase-client" % hbaseVersion,
  "org.apache.hbase" % "hbase-server" % hbaseVersion,
  "org.json4s" %% "json4s-jackson" % "3.3.0"
)


