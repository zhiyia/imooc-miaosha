package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author :zx
 * @date :2019/2/20
 */

public interface PromoService {

    //根据itemId即将进行的或者正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer ItemId);
}
