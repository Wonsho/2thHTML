package kr.co.rland.rland_boot3_api.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import kr.co.rland.rland_boot3_api.anonymous.menu.entity.Menu;
import kr.co.rland.rland_boot3_api.anonymous.menu.repository.MenuCustomRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuRepositoryImpl implements MenuCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Menu> findAll(String korName, Integer price, Integer page, Integer size) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        // select
        CriteriaQuery<Menu> query = cb.createQuery(Menu.class);

        // from
        Root<Menu> root = query.from(Menu.class);


        List<Predicate> predicates = new ArrayList<Predicate>();
        // where [predicate] and [predicate] or [...]
        // 1)
        if (korName != null && !korName.isEmpty()) {
            predicates.add(cb.like(root.get("korName"), "%"+korName+"%"));
        }
//        Predicate korPre = cb.like(root.get("korName"), "%" + korName + "%");

        if (price != null && price > 0) {
            predicates.add(cb.greaterThanOrEqualTo(root.get("price"), price));
        }
//        Predicate pricePre = cb.gt(root.get("price"), price);

//        Predicate orPredicate = cb.or(predicates.toArray(new Predicate[0]));

        query.where(cb.or(predicates.toArray(new Predicate[0])));
        query.orderBy(cb.desc(root.get("regDate")));

        List<Menu> menus = entityManager.createQuery(query)
                .setFirstResult((page-1) * size)    // offset
                .setMaxResults(size)    // limit
                .getResultList();

//        ---------------------------------------------------
        CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
        Root<Menu> countRoot = countQuery.from(Menu.class);
        List<Predicate> countPredicates = new ArrayList<Predicate>();

        if (korName != null && !korName.isEmpty()) {
            countPredicates.add(cb.like(countRoot.get("korName"), "%"+korName+"%"));
        }
        if (price != null) {
            countPredicates.add(cb.greaterThanOrEqualTo(countRoot.get("price"), price));
        }

        countQuery.select(cb.count(countRoot));
        countQuery.where(countPredicates.toArray(new Predicate[0]));
        Long count = entityManager.createQuery(countQuery).getSingleResult();

        return new PageImpl<>(menus, PageRequest.of((page-1), size), count);
    }
}
