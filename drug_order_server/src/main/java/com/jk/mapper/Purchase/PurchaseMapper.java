package com.jk.mapper.Purchase;

import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PurchaseMapper {

    @Select("select * from t_tree")
    List<TreeBean> selectTree();
}
