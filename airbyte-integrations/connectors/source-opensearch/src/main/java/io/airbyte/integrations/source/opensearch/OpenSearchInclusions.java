/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.source.opensearch;

import java.util.List;

public class OpenSearchInclusions {

  private static final String type = "type";
  private static final String properties = "properties";
  public static final List<String> KEEP_LIST = List.of(type, properties);

}
