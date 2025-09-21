package com.universalpetcare.petcare_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="admin_id") // Primary key this table which refers to PK of to User table. Therefore we can call foreign key of User table.
public class Admin extends User{
}
