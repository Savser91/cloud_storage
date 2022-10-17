package com.example.cloudstorage.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@Table(name = "files")
@NoArgsConstructor
@AllArgsConstructor
public class Files {

    @Id
    @Column(nullable = false, unique = true)
    private String filename;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private Long size;

    @Column(nullable = false)
    private String type;

    @Lob
    private byte[] content;

    @ManyToOne
    private Users user;

    public Files(String filename, LocalDateTime now, long size, String contentType, byte[] bytes, Users user) {
    }
}
