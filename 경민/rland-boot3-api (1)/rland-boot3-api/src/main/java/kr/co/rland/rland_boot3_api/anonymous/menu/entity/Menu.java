package kr.co.rland.rland_boot3_api.anonymous.menu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    //    @Column(name = "kor_name")
    private String korName;

    @Column(name = "eng_name")
    private String engName;

    @Column(name = "price", nullable = false)
    private Integer price;

    @CreationTimestamp
    @ColumnDefault("current_timestamp()")
    @Column(name = "reg_date", nullable = true, insertable = false, updatable = false)
    private Instant regDate;

//    @PrePersist
//    public void prePersist() {
//        this.regDate = Instant.now(); // 엔티티가 persist 될 때 자동으로 현재 시간 설정
//    }



    private Long categoryId;
    private Long regMemberId;

    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<MenuImage> images;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id")
//    private Category category;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "reg_member_id")
//    private Member regMember;

}