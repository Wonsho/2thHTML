package kr.co.rland.rland_boot3_api.repository;

import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import kr.co.rland.rland_boot3_api.anonymous.menu.repository.MenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MenuRepositoryTest {

    @Autowired
    private MenuRepository repository;

    @Test
    void joinTest() {
        Sort sort = Sort.by("regDate").descending();
        Pageable pageable = PageRequest.of(0,6, sort);
        List<Long> cids = Arrays.asList(1L,2L,3L);
//        List<Menu> menus = repository.findAllWithDefaultImage("", cids, pageable);
//        List<Menu> menus = repository.findByKorNameAndCategoryIdIn("", cids, pageable);
         Page<Menu> menus = repository.findAll(null, null, pageable);
        menus.forEach(System.out::println);

    }

    @Test
    void queryTest(){

        Sort sort = Sort.by("regDate").descending();
        Pageable pageable = PageRequest.of(0,6, sort);
//        List<Menu> menus = repository.findByKorNameLike("아메리카노",pageable);    // 필터링

        List<Long> cids = Arrays.asList(1L,2L,3L);

//        List<Menu> menus = repository.findByKorNameContainingAndPriceGreaterThanEqualAndCategoryIdIn("아", 2000, cids, pageable);
//        List<Menu> menus = repository.findByQuery("아", 2000, cids, pageable);

        Instant startDate = LocalDateTime.now().minus(1, ChronoUnit.MONTHS).atZone(ZoneId.systemDefault()).toInstant();
        Instant endDate = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant();
//        List<Menu> menus = repository.findByRegDateBetween(startDate, endDate, pageable);
//        menus.forEach(System.out::println);
    }

    @Test
    void streamTest(){

//        List<Menu> list = repository.findAll();
        List<Menu> list = repository.findAll()
                .stream()
                .filter(menu -> menu.getPrice() >= 5000)
                .toList();

        list.forEach(menu-> System.out.println(menu.toString()));
        System.out.println(list);
    }

    @Test
    void findAllTest(){
        Sort sort = Sort.by("regDate").descending();
        Pageable pageable = PageRequest.of(0,6, sort);
//        Sort sort = Sort.by(Sort.Direction.asc, "name");
        Page<Menu> menuPages = repository.findAll(pageable);
        List<Menu> menus = menuPages.getContent();
        System.out.println(menus);

        // 6개씩 나누었을 때 페이지 개수
        int count = menuPages.getTotalPages();
        System.out.println(count);

        // 전체 레코드 개수?
        int totalRowCount = menuPages.getNumberOfElements();
        System.out.println(totalRowCount);

        // 다음 페이지는 있는거야?
        boolean hasNextPage = menuPages.hasNext();
        System.out.println(hasNextPage);

        // 이전 페이지는 있는거야?
        boolean hasPreviousPage = menuPages.hasPrevious();
        System.out.println(hasPreviousPage);

        // 현재 페이지는 몇 개의 레코드를 가지고 있는거지?
        int currentPageRawCount = menuPages.getNumberOfElements();
        System.out.println(currentPageRawCount);
    }

}