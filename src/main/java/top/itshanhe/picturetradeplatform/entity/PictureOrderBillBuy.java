package top.itshanhe.picturetradeplatform.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 购买流水表
 * </p>
 *
 * @author shanhe
 * @since 2023-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("picture_order_bill_buy")
public class PictureOrderBillBuy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 图片id
     */
    private Long imgId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 流水金额数据
     */
    private BigDecimal billCreditsMoneyData;


}
