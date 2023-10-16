package com.sky.service;

import com.sky.dto.DishDTO;

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
}
