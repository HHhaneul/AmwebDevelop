package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseMemberEntity extends BaseEntity{

    @CreatedBy
    @Column(updatable = false, length = 45)
    private String createdBy;

    @LastModifiedBy
    @Column(insertable = false, length = 45)
    private String modifiedBy;
}
