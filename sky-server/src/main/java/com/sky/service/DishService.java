package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * @author yao
 * @version 1.1
 */
public interface DishService {
    /**
     * 添加菜品和口味
     * @param dishDTO
     */
    void saveDishWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    DishVO getByIdWithflavor(Long id);

    void updateWithFlavor(DishDTO dishDTO);
}
