package kr.co.rland.rland_boot3_api.anonymous.menu.controller.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MenuDto {
    @Id
    private Long id;
    private String korName;
    private String engName;
    private Integer price;
    private LocalDateTime regDate;
    private Long categoryId;
    private Long regMemberId;

    // MenuView 처럼 목록을 표현할 때 추가적으로 필요한 속성을 확장
    private String defaultImage;
//    private List<MenuImage> images;
}
