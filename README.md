# LAMA-idea-plugin
Simple IntelliJ IDEA plugin for Lama language

## How to build

### Marketplace 
Search `PLama` in JetBrains Marketplace. It's possible that it won't be found, because plugin is an extremely fresh.
Link: [https://plugins.jetbrains.com/plugin/16704-plama](https://plugins.jetbrains.com/plugin/16704-plama)


### Local install

If you do not yet have a project open in IDEA (and after first-time setup):
1. On the IDEA welcome screen, select “Configure(dropdown)→Plugins”
2. Click “Install plugin from disk…”
3. Select the “intellij-haxe.jar” file you downloaded
4. Allow IDEA to restart and initialize the plugin.

If you already have a project open in IDEA:

1. Open the Settings dialog (File->Settings…)
2. Highlight “Plugins” in the leftmost column
3. Click “Install plugin from disk…”
4. Select the “intellij-haxe.jar” file you downloaded
5. Allow IDEA to restart and initialize the plugin.

The instruction from [Haxe Intellij](http://intellij-haxe.org/wiki/installation).

### Run without installing

You should clone this project and run in the project root `./gradlew runIde`.
