package kr.co.rland.rland_boot3_api.anonymous.menu.repository;

import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface MenuCustomRepository {
    Page<Menu> findAll(String korName, Integer price,Integer page,Integer size);
}
