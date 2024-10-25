package kr.co.rland.rland_boot3_api.anonymous.menu.controller;

import kr.co.rland.rland_boot3_api.anonymous.menu.controller.dto.MenuDto;
import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import kr.co.rland.rland_boot3_api.anonymous.menu.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/menus")
@AllArgsConstructor
public class MenuController {

    private MenuService service;
    private ListCrudRepository<Menu, Long> repository;

    // api//v1/menus?p=1&s=10
    @GetMapping
    public List<Menu> getList(
            @RequestParam(name="p", defaultValue = "1") int page,
            @RequestParam(name = "s", defaultValue = "6") int size
    ){
        return repository.findAll();
//        return service.getList();

    }

    // api/v1/menus/2
    @GetMapping("{id}")
    public ResponseEntity<MenuDto> get(
            @PathVariable("id") Long id){
        System.out.println(id);

        MenuDto menu = MenuDto.builder().korName("맛난 커피1").build();

        return new ResponseEntity<>(menu, HttpStatus.OK);
//        return ResponseEntity.ok().body(menu);
//        return ResponseEntity.ok(menu);
//        return ResponseEntity.ok()
//                .header("new-line", "12")
//                .body(menu);

//        return Menu.builder().korName("맛난 커피1").build();
    }

    @PostMapping
    public ResponseEntity<MenuDto> create(
            @RequestBody MenuDto menuDto){
        System.out.println(menuDto);

        // 서버에 저장
        // 방금 저장한 값들 다시 줘봐
        MenuDto newOne = MenuDto.builder().korName("방금 만들어진 맛난 커피1").build();
        return new ResponseEntity<>(menuDto, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<MenuDto> update(
            MenuDto menuDto,
            @PathVariable("id") Long id
    ){
        menuDto.setKorName("방금 수정된 커피1");
        return new ResponseEntity<>(menuDto, HttpStatus.OK);
    }


//    Put 1번 menu의 menuimage
//    api/v1/menus/1/menuimages/2
//    api/v1/menus/2/menuimages/3
//    api/v1/menu
//    3번 회원(member)이 등록 한 메뉴가 있다.
//    2번 메뉴가 그것인데
//    그 메뉴의 이미지를 등록하는 URL은?

//    @PutMapping("{id}/price/{price}")
//    public ResponseEntity<MenuDto> updatePriceWithValue(MenuDto menuDto){
//
//        menuDto.setKorName("방금 수정된 커피1");
//
//        return new ResponseEntity<>(menuDto, HttpStatus.OK);
//    }

    @DeleteMapping
    public ResponseEntity<String> delete(
            @PathVariable("id") Long id
    ){
        System.out.println(String.format("%d번 항목이 삭제되었습니다",id));
        return new ResponseEntity<>("Succesfully deleted", HttpStatus.OK);
    }

}
