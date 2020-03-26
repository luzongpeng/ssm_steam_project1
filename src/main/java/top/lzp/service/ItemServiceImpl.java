package top.lzp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import top.lzp.bean.ItemInfo;
import top.lzp.mapper.ItemMapper;

import java.util.List;

/**
 * 游戏相关service实现类
 * @author Lu
 * @date 2020/3/25:12:31:09
 * @description
 */
@Repository
public class ItemServiceImpl implements ItemService {
    //mapper
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<ItemInfo> selectAll() {
        return itemMapper.selectAll();
    }
}
