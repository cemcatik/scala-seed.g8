organization := "$organization$"
name := "$name$"

Global / onChangedBuildSource := ReloadOnSourceChanges

enablePlugins(GitVersioning)
enablePlugins(GitBranchPrompt)
git.baseVersion := "1.0"
git.useGitDescribe := true

scalaVersion := "2.12.8"
scalacOptions ++= Seq(
  "-feature"
)

def akka(c: String)   = "com.typesafe.akka" %% s"akka-\$c"   % "2.5.22"
def specs2(c: String) = "org.specs2"        %% s"specs2-\$c" % "4.3.4"

libraryDependencies ++= Seq(
  akka("actor"),
  akka("slf4j"),
  "ch.qos.logback" % "logback-classic" % "1.2.3" % Runtime,
  //
  // Test libraries
  specs2("core")  % Test,
  specs2("junit") % Test
)

scalacOptions in Test ++= Seq("-Yrangepos")
