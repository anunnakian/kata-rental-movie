package com.arolla.refatoring.movierental;

public class Movies {

  public static Movie regular(String title) {
    return new RegularMovie(title);
  }

  public static Movie newRelease(String title) {
    return new NewReleaseMovie(title);
  }

  public static Movie children(String title) {
    return new ChildrensMovie(title);
  }
}
