package top.lzp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lzp.mapper.DictMapper;

import java.util.List;

/**
 * @author Lu
 * @date 2020/3/26:11:49:07
 * @description
 */
@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;
    @Override
    public List<String> selectTagName(List<String> idList) {
        return dictMapper.selectTagName(idList);
    }
}
