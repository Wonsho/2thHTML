package kr.co.rland.rland_boot3_api.admin.menu.service;

import kr.co.rland.rland_boot3_api.admin.menu.dto.MenuListDto;
import kr.co.rland.rland_boot3_api.admin.menu.dto.MenuResponseDto;
import kr.co.rland.rland_boot3_api.admin.menu.mapper.MenuMapper;
import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import kr.co.rland.rland_boot3_api.anonymous.menu.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.LongStream;

@Service("adminMenuService")
public class DefaultMenuService implements MenuService {

    private MenuRepository menuRepository;
    private ModelMapper modelMapper;


    public DefaultMenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public MenuResponseDto getList(Integer page, String korName, List<Long> categoryIds) {
        Sort sort = Sort.by("regDate").descending();
        Pageable pageable = PageRequest.of(page - 1, 6, sort);
//        Page<Menu> menuPage = menuRepository.findAll(korName, categoryIds, pageable);
        Page<Menu> menuPage = menuRepository.findAll("아메리카노", 1000, 2, 4);

//    Page<Menu> menuPage = menuRepository.findAll(pageable);

            List<MenuListDto> menuListDtos = menuPage
                .getContent()
                .stream()
                    .map(menu ->{
                       MenuListDto menuListDto =  modelMapper.map(menu, MenuListDto.class);
                       return menuListDto;
                    } )
//                .map(MenuMapper::mapToDto)
                .toList();

        menuPage.getContent().stream().forEach(System.out::println);

        long totalCount = menuPage.getTotalElements();
        long totalPages = menuPage.getTotalPages();
        boolean nextPage = menuPage.hasNext();
        boolean previousPage = menuPage.hasPrevious();

        page = (page == null) ? 1 : page;
        int offset = (page - 1) % 5;
        int startNum = page - offset;
        List<Long> pages = LongStream
                .range(startNum, startNum+5).boxed().toList();

//        let page = useRoute().query.p || 1;
//        let offset = (page-1)%5;
//        startNum = page-offset;
//        console.log(startNum);
//        let nums = Array.from({length:5}).map((_,i)=>i+startNum);



        return MenuResponseDto
                .builder()
                .menus(menuListDtos)
                .totalCount(totalCount)
                .totalPages(totalPages)
                .nextPages(nextPage)
                .previousPages(previousPage)
                .pages(pages)
                .build();
    }
//
    @Override
    public MenuListDto getById(Long id) {
        Menu menu = menuRepository.findById(id).orElseThrow();

        MenuListDto menuListDto = MenuMapper.mapToDto(menu);

        return menuListDto;
    }

    // POST: api/v1/admin/menus
    @Override
    public MenuListDto create(MenuListDto menuListDto) {
        Menu menu = menuRepository.save(MenuMapper.mapToEntity(menuListDto));

        MenuListDto newOne = MenuMapper.mapToDto(menuRepository.findById(menu.getId()).get());

        return MenuMapper.mapToDto(menu);
    }

    // PUT: api/vi/admin/menus/3
    // MenuDto + id -> MenuDto 함께 포함해서
    // korName/price + id -> korName/price/id
    // isolation level
    // - uncommitted - dirty read
    // - committed - phan
    // -
    @Override
    @Transactional
    public MenuListDto update(MenuListDto menuListDto) {
        Menu menu = menuRepository.findById(menuListDto.getId()).orElseThrow();

        if (menuListDto.getKorName() != null)
            menu.setKorName(menuListDto.getKorName());

        if (menuListDto.getEngName() != null)
            menu.setEngName(menuListDto.getEngName());

        if (menuListDto.getRegDate() != null)
            menu.setRegDate(menuListDto.getRegDate());

        if (menuListDto.getPrice() != null)
            menu.setPrice(menuListDto.getPrice());

        menuRepository.save(menu);

        Menu updatedOne = menuRepository.findById(menuListDto.getId()).orElseThrow();

        return MenuMapper.mapToDto(updatedOne);
    }

    @Override
    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}



