package br.paulotrc.svcvendavalidador.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil<T> {


    private static final ObjectMapper mapper = new ObjectMapper();
    public final Class<T> jsonStringToClass(String json, T ref) throws JsonProcessingException {
        return mapper.readValue(json, (JavaType) ref);
    }

    public static String classToJsonString(Object classe) throws JsonProcessingException {
        return mapper.writeValueAsString(classe);
    }

}
