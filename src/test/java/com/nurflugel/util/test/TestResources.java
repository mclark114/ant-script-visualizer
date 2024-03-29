package com.nurflugel.util.test;

import org.apache.commons.lang.BooleanUtils;

/** Created with IntelliJ IDEA. User: douglas_bullard Date: 6/7/12 Time: 18:12 To change this template use File | Settings | File Templates. */
public class TestResources
{
  private static final String SOURCE_PATH_IDEA   = "build/resources/test/";
  private static final String SOURCE_PATH_GRADLE = "resources/test/";

  private TestResources() {}

  /** We do this because when unit tests run in the IDE the base file path is different than when running under Gradle, so we have to adjust it. */
  public static String getFilePath(String fileName)
  {
    String  property            = System.getProperty("running.in.gradle");
    boolean isGradleEnvironment = BooleanUtils.toBooleanObject(property, "yes", null, "dibble");

    return isGradleEnvironment ? (SOURCE_PATH_GRADLE + fileName)
                               : (SOURCE_PATH_IDEA + fileName);

    // : (SOURCE_PATH_GRADLE + fileName);
  }
}
