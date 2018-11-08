name := "spark-measure"

version := "0.14-SNAPSHOT"

scalaVersion := "2.11.12"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

isSnapshot := true

spName := "spark-measure"
sparkVersion := "2.3.1"
sparkComponents += "sql"

//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1"
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.7"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
//libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.9.1" % "test"
libraryDependencies += "com.github.tomakehurst" % "wiremock" % "2.6.0" % "test"

// publishing to Sonatype Nexus repository and Maven
publishMavenStyle := true

organization := "ch.cern.sparkmeasure"
description := "sparkMeasure is a tool for performance troubleshooting of Apache Spark workloads"
developers := List(Developer(
  "LucaCanali", "Luca Canali", "Luca.Canali@cern.ch",
  url("https://github.com/LucaCanali")
))
homepage := Some(url("https://github.com/LucaCanali/sparkMeasure"))

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/LucaCanali/sparkMeasure"),
    "scm:git@github.com:LucaCanali/sparkMeasure.git"
  )
)
