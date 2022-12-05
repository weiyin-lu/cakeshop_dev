package cn.lntu.group07.mappers;

import cn.lntu.group07.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    List<Goods> selectAllByTypeId(Integer inputId);
}
