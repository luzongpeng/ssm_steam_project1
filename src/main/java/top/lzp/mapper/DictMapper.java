package top.lzp.mapper;

import java.util.List;

/**
 * @author Lu
 * @date 2020/3/26:11:53:39
 * @description
 */
public interface DictMapper {
    List<String> selectTagName(List<String> idList);
}
