package org.bookstore.starting.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity  extends PanacheEntity {

    @Id
    private int id;
}
