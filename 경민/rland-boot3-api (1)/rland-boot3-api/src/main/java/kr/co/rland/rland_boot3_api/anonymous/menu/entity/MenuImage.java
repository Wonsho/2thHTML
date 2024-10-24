package kr.co.rland.rland_boot3_api.anonymous.menu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "menu_image")
public class MenuImage {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "is_default")
    private Boolean isDefault;

//    @Column(name = "menu_id")
//    private Long menuId;

    @Column(name = "src")
    private String src;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    @JsonBackReference
    private Menu menu;


}