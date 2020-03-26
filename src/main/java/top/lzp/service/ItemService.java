package top.lzp.service;

import top.lzp.bean.ItemInfo;

import java.util.List;

/**
 * @author Lu
 * @date 2020/3/25:12:30:06
 * @description
 */
public interface ItemService {
    //查询全部
    List<ItemInfo> selectAll();
}
