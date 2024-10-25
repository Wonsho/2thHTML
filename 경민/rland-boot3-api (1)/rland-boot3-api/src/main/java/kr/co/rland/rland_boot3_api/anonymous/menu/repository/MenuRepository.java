package kr.co.rland.rland_boot3_api.anonymous.menu.repository;

import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long>, MenuCustomRepository {

//    @Query("select m from Menu m left join MenuImage mi on m.id = mi.menu.id where mi.isDefault=true")
//    List<Menu> findAllWithDefaultImage(String korName, List<Long> categoryIds, Pageable pageable);


    @Query("from Menu where " +
            "(:korName is null or korName like concat('%', :korName, '%'))" +
            "and (:categoryIds is null or categoryId in (:categoryIds))")
    Page<Menu> findAll(String korName, List<Long> categoryIds, Pageable pageable);



    // 대부분의 crud 구성
    // 목록
    // 단일 객체
    // 삽입
    // 수정
    // 삭제


//    List<Menu> findByKorNameAndCategoryIdIn(String korName, List<Long> categoryIds, Pageable pageable);
//
//    // 사용자가 입력한 값이 korName과 같은 Menu 목록만 출력(단 1페이지, regDate로 내림차순)
//    List<Menu> findByKorName(String korName, Pageable pageable);
//
//
//    List<Menu> findByKorNameLike(String korName, Pageable pageable);
//    List<Menu> findByKorNameContaining(String korName, Pageable pageable);  // 파라미터가 %로 감싸져 바인딩됨
//    List<Menu> findByKorNameContainingAndPriceGreaterThanEqual(String korName, int price, Pageable pageable);
//    List<Menu> findByKorNameContainingAndPriceGreaterThanEqualAndCategoryIdIn(String korName, int price, List<Long> categoryId, Pageable pageable);
//
//    @Query("from Menu where " +
//            "korName like concat('%', :korName, '%')" +
//            "and (:price is null or price > :price)" +
//            "and (:categoryIds is null or categoryId in (:categoryIds))")
//    List<Menu> findByQuery(String korName, int price, List<Long> categoryIds, Pageable pageable);
//
//
//
//    List<Menu> findByRegDateBetween(Instant startDate, Instant endDate, Pageable pageable);
//
//    // 메뉴 검색 목록 (이미 있기는 한데???? findAll?)
//
//    // 규칙 1 : findBy + 정렬 + 필터링
//    List<Menu> findByOrderByRegDateDesc();

    // 메뉴 상세 (이미 있음 - findById)

    // 메뉴 등록 (이미 있음 - save)

    // 메뉴 수정 (이미 있음 - save)

    // 메뉴 삭제 (이미 있음 - delete)
}
