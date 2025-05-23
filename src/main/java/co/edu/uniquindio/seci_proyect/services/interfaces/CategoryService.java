package co.edu.uniquindio.seci_proyect.services.interfaces;

import co.edu.uniquindio.seci_proyect.dtos.category.CategoryRequest;
import co.edu.uniquindio.seci_proyect.dtos.category.CategoryResponse;
import co.edu.uniquindio.seci_proyect.dtos.category.CategoryWithStatsResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    CategoryResponse save(CategoryRequest category);
    CategoryResponse update(String id,CategoryRequest category);
    List<CategoryResponse> findAll();
    CategoryResponse findById(String id);
    void deleteById(String id);

    List<CategoryResponse> findAllActive();
    Page<CategoryWithStatsResponse> findAllWithStats(int page, int size);
}
