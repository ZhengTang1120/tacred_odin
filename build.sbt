name := "TACRED_ODIN"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Artifactory" at "http://artifactory.cs.arizona.edu:8081/artifactory/sbt-release"

libraryDependencies ++= {
  val procVer = "8.3.1"

  Seq(
    "org.clulab" %% "processors-main" % procVer,
    "org.clulab" %% "processors-corenlp" % procVer,
    "org.clulab" %% "processors-odin" % procVer
  )
}
