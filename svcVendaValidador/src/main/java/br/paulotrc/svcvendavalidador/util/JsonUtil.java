package br.paulotrc.svcvendavalidador.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil<T> {

    public static String classToJsonString(Object classe) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(classe);
    }

    public final Object jsonStringToClass(String json, Class<T> ref) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, ref);
    }
}
