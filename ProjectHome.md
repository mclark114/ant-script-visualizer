This is a working tool which can be used to analyze Ant scripts (yes, more than one) to show how targets, taskdefs, macrodefs, and antcalls work together within and across Ant scripts to perform your build.

The documentation for the current version and Java WebStart download are found at http://ant-script-visualizer.googlecode.com/svn/trunk/webstart/index.html

ATT's GraphViz is currently needed to generate the final graph (I'm not that smart yet): http://www.graphviz.org/

One of the interesting things about this code is I'm not using the Ant libraries to do this - I get much more flexibility and power parsing the XML myself via JDOM, and it lets me do a lot more of playing around with run-time properties and such.

Although this project works as-is, I've got a long list of features and improvements that need to be made (which I could use help with), and folks have asked to download the source, so open sourcing it is a good option.