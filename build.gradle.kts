// region @MadeByLLM("gpt-6", id = "android13-arm64")
plugins {
  id("java-toolchain-convention")
  id(libs.plugins.android.library.get().pluginId)
  id("tgx-module")
}

dependencies {
  implementation(libs.androidx.core.ktx.latest)
  implementation(project(":vkryl:core"))
}

android {
  namespace = "me.vkryl.android"

  lint {
    disable += "ObsoleteSdkInt"
  }
}
// endregion
