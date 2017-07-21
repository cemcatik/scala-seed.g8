organization := "$organization$"
name := "$name$"

enablePlugins(GitVersioning)
git.baseVersion := "1.0"
git.useGitDescribe := true

scalaVersion := "2.12.2"
scalacOptions ++= Seq(
  "-feature"
)

def akka(c: String)   = "com.typesafe.akka" %% s"akka-\$c"   % "2.5.3"
def specs2(c: String) = "org.specs2"        %% s"specs2-\$c" % "3.9.1"

libraryDependencies ++= Seq(
  akka("actor"),
  akka("slf4j"),
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  //
  // Test libraries
  specs2("core")  % Test,
  specs2("junit") % Test
)

wartremoverErrors in (Compile, compile) ++= Warts.allBut(
)
wartremoverErrors in (Test, compileIncremental) := (wartremoverErrors in (Compile, compile)).value diff Seq(
)

scalacOptions in Test ++= Seq("-Yrangepos")
