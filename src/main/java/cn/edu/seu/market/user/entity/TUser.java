package cn.edu.seu.market.user.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("userid")
    private String userid;

    private String name;

    @TableField("openId")
    private String openId;

    private String accid;

    private String token;

    private String weixinname;

    private String weixinid;

    private String weixinpic;

    @TableField("phoneNumber")
    private String phoneNumber;

    private LocalDateTime registdate;

    private LocalDateTime updatedate;

    @TableField("QRcodepath")
    private String QRcodepath;

    private Integer parentid;

    private Integer userlevel;

    private Integer teamnum;

    private Integer straightpush;

    private Integer userclient;

    private String other1;

    private String other2;


}
