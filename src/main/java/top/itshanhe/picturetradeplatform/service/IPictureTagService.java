package top.itshanhe.picturetradeplatform.service;

import top.itshanhe.picturetradeplatform.dto.PictureNav;
import top.itshanhe.picturetradeplatform.entity.PictureTag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author shanhe
 * @since 2024-01-03
 */
public interface IPictureTagService extends IService<PictureTag> {
    
    boolean selectTag(String trim);
    
    Long getTagId(String trim);
    
    List<PictureNav> selectTagAll(String defaultDomain);
}
