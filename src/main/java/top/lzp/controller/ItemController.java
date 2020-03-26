package top.lzp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lzp.bean.ItemInfo;
import top.lzp.service.DictService;
import top.lzp.service.ItemService;


import java.util.List;

/**
 * 游戏相关 controller
 * @author Lu
 * @date 2020/3/25:12:22:19
 * @description
 */
@Controller
@RequestMapping("/admin/items")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @Autowired
    private DictService dictService;

    //项目名称/items
    @RequestMapping("")
    public String list(Model model){
        List<ItemInfo> itemList= itemService.selectAll();
        model.addAttribute("itemList",itemList);
        return "admin/item_list";
    }

    @RequestMapping("/adminTags")
    @ResponseBody
    public List<String> tagName(@RequestBody List<String> idList){
        //查询 用到 dictService
        List<String> nameList = dictService.selectTagName(idList);

        return nameList;
    }

}
