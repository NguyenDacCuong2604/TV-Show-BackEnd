package com.rse.tvshow.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pictures")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String path;

    @ManyToOne
    @JoinColumn(name = "tv_show_id")
    private TvShow tvShow;

}