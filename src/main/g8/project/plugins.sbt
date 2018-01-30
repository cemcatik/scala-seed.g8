addSbtPlugin("com.typesafe.sbt" % "sbt-git"              % "0.9.3")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")
addSbtPlugin("com.lucidchart"   % "sbt-scalafmt"         % "1.15")
addSbtPlugin("org.wartremover"  % "sbt-wartremover"      % "2.2.1")

libraryDependencies ++= Seq(
  // To get rid of SLF4J warnings when sbt starts up
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)
