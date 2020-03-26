package top.lzp.mapper;

import top.lzp.bean.ItemInfo;

import java.util.List;

/**
 * @author Lu
 * @date 2020/3/25:12:33:10
 * @description
 */
public interface ItemMapper {
    //查询全部
    List<ItemInfo> selectAll();
}
