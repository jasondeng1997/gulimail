package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuAttrValueEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author JasonDeng2022
 * @date 2021年05月15日 0:00
 */
public class SpuAttrValueVo extends SpuAttrValueEntity {
    private List<String> valueSelected;
    public void  setValueSelected(List<String>valueSelected){
        if(CollectionUtils.isEmpty(valueSelected)){
            return;
        }
        this.setAttrValue(StringUtils.join(valueSelected,","));
    }
}
