package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author Sidney 2019-01-06.
 */
public interface PromoService {
    //根据商品id获得正在进行即将进行的活动模型
    PromoModel getPromoByItemId(Integer itemId);
}
