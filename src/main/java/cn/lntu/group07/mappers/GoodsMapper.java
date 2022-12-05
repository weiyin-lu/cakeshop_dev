package cn.lntu.group07.mappers;

import cn.lntu.group07.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    /**
     * 在goods表中查询所有记录
     * @return Goods集合
     */
    List<Goods> selectAllGoods();

    /**
     * 按照name字段检索goods表（模糊匹配）
     * @param inputGoodsName 商品名
     * @return Goods集合
     */
    List<Goods> selectByGoodsName(String inputGoodsName);

    /**
     * 查询所有id值为预设值的商品，返回goods表和recommend表全部字段
     * @param inputId 类别id
     * @return Goods集合
     */
    List<Goods> selectByTypeId(Integer inputId);

    /**
     * 查询goods表中匹配名字的type表name字段（严格匹配）
     * @param inputGoodsName goods表name字段
     * @return type表name字段（集合）
     */
    List<String> selectTypeNameByGoodsName(String inputGoodsName);
}
