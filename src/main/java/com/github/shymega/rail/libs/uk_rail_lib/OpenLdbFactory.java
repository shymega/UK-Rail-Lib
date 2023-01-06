package com.github.shymega.rail.libs.uk_rail_lib;

public class OpenLdbFactory {
  public OpenLdbService getLdb(OpenLdbType ldbType, String ldbToken) {
    // null check
    if (ldbType == null) {
      return null;
    }

    switch (ldbType) {
      case PUBLIC:
        return new OpenLdbWs(ldbToken);

      case STAFF:
        return new OpenLdbSvWs(ldbToken);

      default:
        return null;
    }
  }

  public static enum OpenLdbType {
    STAFF,
    PUBLIC,
  }
}
