package com.mealmap.restaurantlisting.mapper;

import com.mealmap.restaurantlisting.dto.RestaurantDTO;
import com.mealmap.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
}
