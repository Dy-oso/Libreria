package com.alura.libreriaweb.ConsumoAPI_confi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.alura.libreriaweb.ConsumoAPI_confi.confi.convertir_da;

public class ConvertirDatos implements convertir_da {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertirDatosJsonAJava(String json, Class<T> clase ) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
