addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"          % "0.8.0")
addSbtPlugin("com.typesafe.sbt"         % "sbt-git"              % "0.9.3")
addSbtPlugin("net.virtual-void"         % "sbt-dependency-graph" % "0.8.2")
addSbtPlugin("com.geirsson"             %% "sbt-scalafmt"        % "0.6.8")

libraryDependencies ++= Seq(
  // To get rid of SLF4J warnings when sbt starts up
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)
