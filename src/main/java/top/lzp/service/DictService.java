package top.lzp.service;

import java.util.List;

/**
 * @author Lu
 * @date 2020/3/26:11:47:51
 * @description
 */

public interface DictService {
    //根据词典id 查询返回对应的dict_item_name
    List<String> selectTagName(List<String> idList);
}
