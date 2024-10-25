package kr.co.rland.rland_boot3_api.admin.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuResponseDto {

    private long totalCount;
    private long totalPages;
    private Boolean nextPages;
    private Boolean previousPages;
    private List<Long> pages;
    private List<MenuListDto> menus;
}
