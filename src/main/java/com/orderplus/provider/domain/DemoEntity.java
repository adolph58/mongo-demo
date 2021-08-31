package com.orderplus.provider.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author Arte
 * @create 21-8-30
 */
@Document(collection = "demo_collection")
@Data
public class DemoEntity implements Serializable {

    @Id
    private Long id;

    private String title;

    private String description;

    private String by;

    private String url;

}
