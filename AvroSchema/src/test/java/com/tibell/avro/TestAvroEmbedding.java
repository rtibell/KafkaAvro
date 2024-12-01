package com.tibell.avro;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAvroEmbedding {
    @Test
    public void testAvroEmbedding() {
        Embedding embedding = Embedding.newBuilder()
                .setId("96387914-d8ce-4edb-ad95-87ecc2cbe1b1")
                .setTitle("Title")
                .setDescription("Description")
                .setEmbeddings(List.of(13.23, 15.32, 8.23, 52.23))
                .build();
        assertEquals("96387914-d8ce-4edb-ad95-87ecc2cbe1b1", embedding.getId());
        assertEquals("Title", embedding.getTitle());
        assertEquals("Description", embedding.getDescription());
        assertEquals(List.of(13.23, 15.32, 8.23, 52.23), embedding.getEmbeddings());
    }
}
