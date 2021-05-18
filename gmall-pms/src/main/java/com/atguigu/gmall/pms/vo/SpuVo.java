package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuEntity;
import lombok.Data;

import java.util.List;

/**
 * @author JasonDeng2022
 * @date 2021年05月14日 23:58
 */
@Data
public class SpuVo extends SpuEntity {
    private List<String> spuImages;

    private List<SpuAttrValueVo> baseAttrs;

    private List<SkuVo> skus;

}
