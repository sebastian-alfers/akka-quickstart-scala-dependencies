name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.14"

resolvers += "Akka library repository".at("https://repo.akka.io/maven/")

// Run in a separate JVM, to make sure sbt waits until all threads have
// finished before returning.
// If you want to keep the application running while executing other
// sbt tasks, consider https://github.com/spray/sbt-revolver/
fork := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.9.0",
  "ch.qos.logback" % "logback-classic" % "1.5.6",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.9.4" % Test,
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)
