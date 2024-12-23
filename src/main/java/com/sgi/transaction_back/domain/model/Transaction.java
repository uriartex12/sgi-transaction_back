package com.sgi.transaction_back.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private String productId;
    private String type;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal amount;
    private String description;
    private String clientId;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal balance;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedDate
    private Instant updatedDate;

}