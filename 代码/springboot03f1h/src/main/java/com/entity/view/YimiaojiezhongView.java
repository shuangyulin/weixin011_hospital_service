package com.entity.view;

import com.entity.YimiaojiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗接种
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
@TableName("yimiaojiezhong")
public class YimiaojiezhongView  extends YimiaojiezhongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaojiezhongView(){
	}
 
 	public YimiaojiezhongView(YimiaojiezhongEntity yimiaojiezhongEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaojiezhongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
