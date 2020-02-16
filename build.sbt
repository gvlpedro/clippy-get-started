import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion     := "2.12.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

ThisBuild / autoStartServer := false

/**
 *  Yoy can add clippy libraries (f.e play, spray...) scala-clippy.org
 *      gunzip ~/.clippy/clippy.json.gz
 */

import com.softwaremill.clippy.ClippySbtPlugin.ClippyColor

lazy val root = (project in file("."))
  .settings(
    name := "clippy-example",
    clippyColorsEnabled := true,
    clippyColorDiff := Some(ClippyColor.LightMagenta),
    libraryDependencies += scalaTest % Test
  )

