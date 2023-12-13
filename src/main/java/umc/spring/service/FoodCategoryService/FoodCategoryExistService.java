package umc.spring.service.FoodCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.spring.repository.FoodCategoryRepository;

import java.util.List;

@Service
public class FoodCategoryExistService {

    private final FoodCategoryRepository foodCategoryRepository;

    @Autowired
    public FoodCategoryExistService(FoodCategoryRepository foodCategoryRepository) {
        this.foodCategoryRepository = foodCategoryRepository;
    }

    public boolean areAllCategoriesExist(List<Long> categoryIds) {
        return categoryIds.stream().allMatch(foodCategoryRepository::existsById);
    }
}

