package ca.jrvs.apps.trading.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

public class JsonUtil {

  /**
   * Convert a java object into a JSON string (serialize java object)
   *
   * @param object
   * @param prettyJson
   * @param includeNullValues
   * @return
   * @throws JsonProcessingException
   */
  public static String toJson(Object object, boolean prettyJson, boolean includeNullValues)
      throws JsonProcessingException {
    ObjectMapper m = new ObjectMapper();
    if (!includeNullValues)
      m.setSerializationInclusion(Include.NON_NULL);

    if (prettyJson)
      m.enable(SerializationFeature.INDENT_OUTPUT);

    return m.writeValueAsString(object);
  }

  /**
   * Parse a JSON string into a java object (deserialize JSON string)
   *
   * @param json
   * @param clazz
   * @param <T>
   * @return
   * @throws IOException
   */
  public static <T> T toObjectFromJson(String json, Class clazz) throws IOException {
    ObjectMapper m = new ObjectMapper();
    return (T)m.readValue(json, clazz);
  }

}
