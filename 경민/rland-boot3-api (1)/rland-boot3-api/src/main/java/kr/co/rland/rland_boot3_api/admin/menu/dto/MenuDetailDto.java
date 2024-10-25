package kr.co.rland.rland_boot3_api.admin.menu.dto;

import kr.co.rland.rland_boot3_api.anonymous.menu.entity.MenuImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuDetailDto {

        private Long id;
        private String korName;
        private String engName;
        private Integer price;
        private Instant regDate;

        private Long categoryId;
        private Long regMemberId;

        // 1. 컬렉션
        private List<MenuImage> images;

        // 2. 대표이미지
//        private MenuImage image;

        // 3. 이미지 src
//        private String image;
}
