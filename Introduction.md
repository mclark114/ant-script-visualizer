# Introduction #

**What exactly is the Ant Script Visualizer?**

Ant Script Visualizer is a program I've written to make visualizing how your Ant targets and scripts are related to one another.

Ever take a look at an Ant build script (or worse, several related scripts) and, although perfectly readable, not really "see" all the dependencies between targets?

What targets depend on a certain taskdef? Or a macrodef? Do macrodefs rely on other macrodefs? And all those imported Ant scripts - where do they fit in? This program was designed to show that, by importing your Ant scripts and creating graphic file representations of them. Say what?

OK, here's an example of the output for the build file used for this program:

**Features**
  * Parses build files for the following task usages:
    * target
    * ant
    * antcall
    * depends
    * property
    * import
    * taskdef
    * macrodef
  * Groups results by build file subgraphs (default), or optionally, all items together in one graph
  * Ability to filter/show included obects by target, imported files, ant calls, taskdefs, and macrodefs
  * Output formats: PNG (default for PC), PDF (default for OS X, not available otherwise), SVG.