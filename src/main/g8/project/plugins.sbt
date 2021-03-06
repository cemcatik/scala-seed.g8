addSbtPlugin("com.typesafe.sbt" % "sbt-git"              % "1.0.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")
addSbtPlugin("org.scalameta"    % "sbt-scalafmt"         % "2.0.4")

libraryDependencies ++= Seq(
  // To get rid of SLF4J warnings when sbt starts up
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)
