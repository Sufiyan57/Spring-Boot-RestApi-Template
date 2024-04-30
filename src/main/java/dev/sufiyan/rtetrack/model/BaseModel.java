package dev.sufiyan.rtetrack.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseModel {
    @Column(name="created_by", nullable = false)
    @CreatedBy
    private String createdBy;
    @Column(name = "created_at",nullable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="mod_by", nullable = false)
    @LastModifiedBy
    private String modBy;
    @Column(name = "mod_at", nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date modAt;
}
